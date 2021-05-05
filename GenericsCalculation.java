
public class GenericsCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer  oddCheck = 3;
		Integer primeCheck = 11;
		Integer palindromeCheck = 1221;
		String paliCheck = "abccba";
		
		calculations<Integer> calc1 = new CalculationService<Integer>(oddCheck);
		System.out.println("odd number:"+calc1.oddNumber());
		
		calculations<Integer> calc2 = new CalculationService<Integer>(primeCheck);
		System.out.println("prime number:"+calc2.primeNumbers());
		
		calculations<Integer> calc3 = new CalculationService<Integer>(palindromeCheck);
		System.out.println("palindrome number:"+calc3.palindrome());
		
		calculations<String> calc4 = new CalculationService<String>(paliCheck);
		System.out.println("palindrome number:"+calc4.palindrome());
	}

}

interface calculations<T>
{
	Boolean oddNumber();
	Boolean primeNumbers();
	Boolean palindrome();
}

class CalculationService<T extends Object> implements calculations<T>
{
	T vals;

	public CalculationService(T o) {
		// TODO Auto-generated constructor stub
		vals = o;
	}
	
	@Override
	public Boolean oddNumber() {
		// TODO Auto-generated method stub
		
		if((Integer) vals%2==0)	
			return false;
		
		return true;
		
	}

	@Override
	public Boolean primeNumbers() {
		
		for(int i =2;i<(Integer) vals/2;i++)
		{
			if((Integer) vals%i==0)
				return false;
		}
		
		return true;
	}

	@Override
	public Boolean palindrome() {
		
		if(vals instanceof Integer)
		{
			if((Integer) vals<=9)
				return true;
			
			Integer n = (Integer) vals;
			
			Integer digit = n;
			Integer rev = 0;
			
			
			while(n>0)
			{
				Integer rem = n % 10; 
				n = n/10;
				rev = rev*10 + rem;
			}
			
			if(!rev.equals(digit))
				return false; 
		} 
		
		if(vals instanceof String)
		{
			String value = (String) vals;
			int left = 0;
			for(int i = value.length()-1;i>0;i--)
			{
				if(((String) vals).charAt(left) != value.charAt(i))
					return false;
				
				left++;
			}
		}
		
		
		
		return true;
	}

}
