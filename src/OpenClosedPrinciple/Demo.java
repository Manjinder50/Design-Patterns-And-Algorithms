package OpenClosedPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
		Product house = new Product("House",Color.BLUE,Size.LARGE);
		
		List<Product> products = new ArrayList<Product>();
		products.add(apple);
		products.add(tree);
		products.add(house);
		
		ProductFilter pf = new ProductFilter();
		
		System.out.println("Green products (old): ");
		pf.filterByColor(products, Color.GREEN).forEach(p->System.out.println(" - "+p.name+" is green"));

		
		//here we are not going to make changes to the existing classes if the criteria for filtering changes. We have made seperate classes like 
		//ColorSpecification and SizeSpecification instead of adding new method in ProductFilter class when a new criteria for filteration needs to be added
		//Now if we the requirement comes for a new filteration criteria then a seperate class which implements Specification Interface will be created
		BetterFilter bf = new BetterFilter();
		
		System.out.println("Green products (new): ");
		
		bf.filter(products, new ColorSpecification(Color.GREEN)).forEach(p->System.out.println(" - "+p.name+ " is green"));

		//To find large blue items
		System.out.println("Large Blue Items");
		
		bf.filter(products,new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE))).forEach(p -> System.out.println(" - "+p.name+" is large and blue"));
	}

}
