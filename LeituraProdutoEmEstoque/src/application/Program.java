
//Meu primeiro programa elaborado sem ajuda.
//para chamar um atributo ou metodo de uma classe usamos o atribudo do tipo da classe mais o " . " metodo da classe.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product();
		
		product.name = name;
		product.price = price;
		product.quantity = quantity;

		System.out.println();
		System.out.println(product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int entradaEstoque = sc.nextInt();
		product.entrada(entradaEstoque);
		
		System.out.println();
		System.out.println(product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		int retiradaEstoque = sc.nextInt();
		product.retirada(retiradaEstoque);
		
		System.out.println();
		System.out.println(product.toString());
		
		sc.close();

	}

}
