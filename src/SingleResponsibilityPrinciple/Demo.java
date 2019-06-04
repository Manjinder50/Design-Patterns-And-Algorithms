package SingleResponsibilityPrinciple;


public class Demo {

	public static void main(String[] args) throws Exception{

		Journal j = new Journal();
		j.addEntry("I cried today");
		j.addEntry("I ate a bug today");
		
		System.out.println(j);
		
		String fileName = "C:\\temp\\journal.txt";
		Persistence p = new Persistence();
		p.saveToFile(j, fileName, true);
		
		Runtime.getRuntime().exec("notepad.exe "+fileName);
	}

}
