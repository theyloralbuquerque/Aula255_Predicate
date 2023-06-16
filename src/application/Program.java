package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;

		Predicate<Product> pred = p -> p.getPrice() >= min; // Express�o lambda.

		list.removeIf(pred); // removeIf() vai percorrer toda a list removendo elementos que tenham pre�o maior que 100, assim como pred diz.

		for (Product p : list) {
			System.out.println(p);
		}
	}
}