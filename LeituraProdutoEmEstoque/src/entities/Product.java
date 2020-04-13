package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalEstoque() {
		return quantity * price;
	}
	
	public void entrada(int entradaProduto) {
		quantity += entradaProduto;
	}

	public void retirada(int retirarProduto) {
		quantity -= retirarProduto;
	}

	@Override
	public String toString() {
		return "Product data: " + name + ", $ " + price + ", " + quantity + " units, Total: $ " + totalEstoque();
	}
	
	
	
}
