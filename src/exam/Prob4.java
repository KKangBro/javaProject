package exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;

public class Prob4 {

	public static void main(String[] args) {
		Product[] prodList = {
			new Product("NT450R5E-K24S", 500000, "삼성전자"),
			new Product("15UD340-LX2CK", 400000, "LG전자"),
			new Product("G2-K3T32AV", 600000, "HP")
		};
		HashSet<Product> product_hs = makeHashSet(prodList, 500000);
		makeFile(product_hs);
		readFile();

	}

	private static HashSet<Product> makeHashSet(Product[] prodList, int price) {
		HashSet<Product> set = new HashSet<>();
		for (Product p : prodList) {
			if (p.getPrice() >= price) {
				set.add(p);
			}
		}
		return set;
	}

	private static void makeFile(HashSet<Product> resultList) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/data.txt"));
			System.out.println("*특정 금액 이상의 상품 결과입니다.****************");
			for (Product p : resultList) {
				System.out.println(p);

				bw.write(p.toString());
				bw.newLine();
			}
			bw.close();
			System.out.println("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFile() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/data.txt"));
			System.out.println("*readFile결과입니다.****************");
			String row;
			while ((row = br.readLine()) != null) {
				System.out.println(row);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Product implements Serializable {
	private String model_name;
	private int price;
	private String company;

	public Product(String model_name, int price, String company) {
		super();
		this.model_name = model_name;
		this.price = price;
		this.company = company;
	}

	public String getModel_name() {
		return model_name;
	}

	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Product [model_name=" + model_name + ", price=" + price + ", company=" + company + "]";
	}

}