package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common,used or imported (c/u/i)?");
			char x = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Price:");
			Double price = sc.nextDouble();
			if (x == 'i') {
				System.out.print("Customs fee:");
				Double customsFee = sc.nextDouble();
				Product produto = new ImportedProduct(name, price, customsFee);
				list.add(produto);
			} else if (x == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY):");
				Date manufactureDate = sdf.parse(sc.next());
				Product produto = new UsedProduct(name, price, manufactureDate);
				list.add(produto);
			} else {
				Product produto = new Product(name, price);
				list.add(produto);
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product produto : list) {
			System.out.println(produto.priceTag());
			sc.close();
		}
	}
}