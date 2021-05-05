
public class GenericsBinarySearch<T extends Comparable<T>> 
{
	public  Integer search(Integer[] a, Integer target)
	{
		Integer i=0;
		Integer len = a.length-1;
		Integer mid = i+(len-i)/2;
		
		while(i<=len)
		{
			if(target.equals(a[mid]))
				return mid;
			else if(a[mid].compareTo(target)<0)
			{
				i = mid+1;
			}else if(a[mid].compareTo(target)>0)
			{
				len = mid-1;
			}
			
			mid = i+(len-i)/2;
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,2,3,4,5,6,7,8,9,10,11};
		
		GenericsBinarySearch binarySearch = new GenericsBinarySearch();
		Integer ans = binarySearch.search(a, 10);
		System.out.println(ans);
	}
}
