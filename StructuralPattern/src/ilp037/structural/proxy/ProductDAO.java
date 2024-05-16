package ilp037.structural.proxy;

import java.util.List;
import java.util.Random;

public class ProductDAO {
	private List<Product> products;
	
	public ProductDAO(List<Product> products) {
		this.products = products;
	}
	
	public Product findById(Integer id) {
		simulateDelay();
		return this.products.stream()
				.filter(e -> e.getId()== id)
				.findFirst()
				.orElse(null);
	}
	
	public void save(Product product) {
		simulateDelay();
		products.add(product);
	}
	
	public void delete(Product product) {
		simulateDelay();
		products.remove(product);
	}
	
	
	private void simulateDelay() {
		Random r = new Random();
		try {
			Thread.sleep(r.nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
