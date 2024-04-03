package ilp037.creational.abstractfactory;

import java.lang.reflect.InvocationTargetException;

public interface KingdomFactory {
	
	public Army createArmy();
	public Castle createCastle();
	public King createKing();
	
	public static KingdomFactory getInstance(String type) {
		type = "ilp037.creational.abstractfactory."+type+"Kingdom";
		KingdomFactory f = null;
		try {
			f = (KingdomFactory)
					Class.forName(type)
					.getDeclaredConstructor()
					.newInstance();
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		return f;
		
	}
	

}
