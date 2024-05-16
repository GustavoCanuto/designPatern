package ilp037.structural.proxy;

import java.util.List;
import java.util.logging.Logger;

public class ProductDAOProxy extends ProductDAO{


	private static final  Logger LOG =Logger.getLogger(ProductDAOProxy.class.getName());
			
	private static final long SLOW = 0;

	public ProductDAOProxy(List<Product> products) {
		super(products);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Product findById(Integer id) {
		long start = System.currentTimeMillis();
		
		var ret = super.findById(id);
		logSlowQuery(start);
		return ret;
	}
	
	@Override
	public void delete(Product product) {
		long start = System.currentTimeMillis();
		super.delete(product);
		logSlowQuery(start);
	}

	private void logSlowQuery(long start) {
		long timelapse  = System.currentTimeMillis() - start;
		var frame = Thread.getAllStackTraces().get(Thread.currentThread())[3];
		
		if(timelapse >= SLOW) LOG.warning(frame.getMethodName() + "lento "+timelapse+" ms");
	}
}
