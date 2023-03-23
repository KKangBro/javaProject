package com.shinhan.day07.ch12_prac;

import java.text.SimpleDateFormat;
import java.util.Date;

public class N15 {
    public static void main(String[] args) throws Exception {
        // https://coding-factory.tistory.com/737
        Date now = new Date();
        Date dDay = new SimpleDateFormat("yyyy/MM/dd").parse("2023/12/31");
//        System.out.println(now);
//        System.out.println(dDay);

        long diffSec = (dDay.getTime() - now.getTime()) / 1000; // 초 차이
        long diffDays = diffSec / (24 * 60 * 60); // 일자수 차이
        System.out.println(diffDays);
    }
}