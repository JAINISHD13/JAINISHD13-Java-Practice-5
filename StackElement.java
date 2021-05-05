
public class StackElement<T> {

	T value;
	public StackElement<T> next;
	
	public StackElement(T value, StackElement<T> top) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.next = top;
	}


	public StackElement<T> getNext() {
		return next;
	}


	public T getValue() {
		// TODO Auto-generated method stub
		return value;
	}

}
