package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) { 
		return p.getPrice() >= 100.0; // Retorne verdadeiro se o preço do produto for maior ou igual a 100.
									  // Se retornar verdadeiro, o removeIf() na classe Program irá remover o objeto da Lista list.
	}
}