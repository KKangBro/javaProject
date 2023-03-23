package com.shinhan.day09;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {

	public static void main(String[] args) {
		f2();
	}

	// Callable 인터페이스 구현하여 쓰레드 사용 .. return 있음.
	private static void f2() {
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 1; i <= 100; i++) {
			int idx = i;
			Future<Integer> future = service.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int j = 0; j <= idx; j++) {
						sum += j;
					}
					System.out.print(Thread.currentThread().getName());
					return sum;
				}

			});
			try {
				int rst = future.get();
				System.out.println("\t\tfuture.get(): 1 ~ " + idx + " 합계는 " + rst);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		service.shutdown();
	}

	// Runnable 인터페이스 구현하여 쓰레드 사용 .. return 없음.
	private static void f1() {
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 1; i <= 1000; i++) {
			service.execute(new Runnable() {

				@Override
				public void run() {
					String tname = Thread.currentThread().getName();
					System.out.println(tname);
				}
			});
		}

		service.shutdown();
	}

}
