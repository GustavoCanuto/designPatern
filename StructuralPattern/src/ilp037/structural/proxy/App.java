package ilp037.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "teste1",100.0));
		products.add(new Product(2, "teste2",800.0));
		products.add(new Product(3, "teste3",700.0));
		products.add(new Product(4, "teste4",600.0));
		products.add(new Product(5, "teste5",500.0));
		
		ProductDAO dao = new ProductDAO(products);
		dao.findById(1);
		dao.save(new Product(6, "Carregador USB",55.99));
		Product p = dao.findById(2);
		dao.delete(p);
	
	}

}
