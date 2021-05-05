import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMergeSort<T extends Comparable<T>> {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {8,6,7,5,3,0,9};
		
		GenericsMergeSort<Integer> mergeSort = new GenericsMergeSort<Integer>();
		
		System.out.println("Ans:"+ mergeSort.genericSorting(Arrays.asList(arr)));		
		
		String[] arrString = {"five","eight","one","nine", "zero"};
		
		GenericsMergeSort<String> mergeSort1 = new GenericsMergeSort<String>();
		
		System.out.println("Ans:"+ mergeSort1.genericSorting(Arrays.asList(arrString)));		
		
	}

	private List<T> genericSorting(List<T> arr) 
	{
		if(arr.size()<=1)
			return arr;
		
		else
		{
			
			List<T> left = new ArrayList();
			List<T> right = new ArrayList();
			
			
			
			int mid =arr.size()/2;
			
			for(int i=0;i<mid;i++)
			{
				left.add(arr.get(i));
			}
			
	
			for(int i=mid;i<arr.size();i++)
			{
				right.add(arr.get(i));
			}
			
			return merge(genericSorting(left),genericSorting(right));
		
			
		}
		
	}

	private List<T> merge(List<T> leftArr, List<T> rightArr) {
		// TODO Auto-generated method stub
		
		List<T> ans = new ArrayList<>();
		Integer left = 0,right = 0;
		
		while(left+1 <= leftArr.size() || right+1 <= rightArr.size())
		{
			if(left+1 <= leftArr.size() && right+1 <= rightArr.size())
			{
				if(leftArr.get(left).compareTo(rightArr.get(right)) <= 0.0)
				{
					ans.add(leftArr.get(left));
					left++;
				}
				else
				{
					ans.add(rightArr.get(right));
					right++;
				}
			}else if(left+1 <= leftArr.size())
			{
				ans.add(leftArr.get(left));
				left++;
			}else if(right+1 <= rightArr.size())
			{
				ans.add(rightArr.get(right));
				right++;
			}
		}
		
		
		return ans;
	}

}
