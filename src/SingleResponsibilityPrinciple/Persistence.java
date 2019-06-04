package SingleResponsibilityPrinciple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

/**
 * 
 * @author Manjind14008 Created the persistence class so that the single
 *         responsibility principle of the Journal class will not be breached.
 */
public class Persistence {

	public void saveToFile(Journal journal, String fileName, boolean overwrite) throws FileNotFoundException {

		if (overwrite || new File(fileName).exists()) {

			try {
				PrintStream out = new PrintStream(fileName);
				out.println(journal.toString());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public Journal load(String fileName) {
		return null;

	}

	public void load1(URL url) {

	}
}
