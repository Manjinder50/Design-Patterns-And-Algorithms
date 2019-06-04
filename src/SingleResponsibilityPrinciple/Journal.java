package SingleResponsibilityPrinciple;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {

	private final List<String> entries = new ArrayList();
	private static int count = 0;
	
	public void addEntry(String text) {
		
		entries.add(""+(++count)+": "+text);
	}
	
	public void removeEntry(int index) {
		
		entries.remove(index);
	}
	
	//Breaking the single responsibility principle by adding a save and load methods
	public void save(String fileName) {
		
		try {
			PrintStream out = new PrintStream(fileName);
			out.println(toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public void load(String fileName) {
		
	}
	
	public void load(URL url) {
		
	}

	@Override
	public String toString() {
		return String.join(System.lineSeparator(), entries);
	}
	
}
