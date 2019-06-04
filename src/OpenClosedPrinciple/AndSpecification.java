package OpenClosedPrinciple;
/**
 * 
 * @author Manjind14008
 *	This class combines two specifications
 */
public class AndSpecification<T> implements Specification<T>{

	private Specification<T> first;
	private Specification<T> second;
	
	public AndSpecification(Specification<T> first, Specification<T> second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean isSatisfied(T item) {
		return first.isSatisfied(item) && second.isSatisfied(item);
	}

}
