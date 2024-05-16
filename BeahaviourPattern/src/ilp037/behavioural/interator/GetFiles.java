package ilp037.behavioural.interator;

import java.io.File;
import java.util.Iterator;

public class GetFiles {

	private String path;
	private File[] list;
	private int cursor =0;
	
	public GetFiles(String path) {
		this.path = path;
	}
	
	public Iterator<File> iterator(){
		File file = new File(path);
		list = file.listFiles();
		
		return new Iterator<File>() {

			@Override
			public boolean hasNext() {
				return list.length> cursor;
			}

			@Override
			public File next() {
				
				return list[cursor++];
			}
			
		};
	}
}
 