package ilp037.creational.singleton;

public class Database {
	
	public static int counter;
	private static Database db;
	
	private Database() {
		counter++;
	}

	
	public static Database getSingleton() {
		if(db == null) {
			db = new Database();
		}
		return db;
	}
}
