package OpenClosedPrinciple;

public class SizeSpecification implements Specification<Product> {

	private Size size;
	
	public SizeSpecification(Size size) {
		super();
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product item) {
		
		return item.size == size;
	}

}
