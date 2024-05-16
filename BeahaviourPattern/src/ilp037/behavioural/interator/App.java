package ilp037.behavioural.interator;

import java.io.File;
import java.util.Iterator;

public class App {
	
	public static void main (String[] args) {
		GetFiles  gf = new GetFiles("C:\\Program Files");
	   Iterator<File> iterator = gf.iterator();
	   while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
