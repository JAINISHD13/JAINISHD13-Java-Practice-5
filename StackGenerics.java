class StackService<T extends Object>
{
	int size = 0;
	StackElement<T> top;
	
	public StackService() {
		// TODO Auto-generated constructor stub
		size = 0;
		top = null;
	}
	

	public void push(T value) {
		
		StackElement<T> newElement = new StackElement<T>(value,top);
		System.out.println("Element "+value+ " added to the stack!");
		top = newElement;
		size++;
	}

	public T pop() {
		// TODO Auto-generated method stub
		StackElement<T> topElement = top ;
		if(topElement == null)
			return null;
		
		top = top.getNext();
		
		return topElement.getValue();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		if(size==0)
			return true;
		
		return false;
	}
		
}

public class StackGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackService<Integer> val1 = new StackService<Integer>(); 
		val1.push(1);
		val1.push(3);
		val1.push(5);
		val1.push(8);
		
		System.out.println("Stack1:"+val1.pop());
		
		StackService<String> val2 = new StackService<String>(); 
		val2.push("Hello!");
		val2.push("world!");
		val2.push("jainish");
		
		StackService<String> val3 = new StackService<String>(); 
		System.out.println("Check for empty Stack:"+val3.isEmpty());
		
		
		
	}

}
