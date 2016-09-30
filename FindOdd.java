package test;

public class FindOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {1,1,2,2,3,3,5,5,6};
		int size = arr.length;
		System.out.println(size);
		int high = size-1;
		int low = 0;
		int mid = (low+high)/2;
		System.out.println(arr[mid]);
		while(low<=high)
		{
			System.out.println("mid is" +mid);
			if(mid%2 == 0 && arr[mid] == arr[mid+1])
			{
				low=mid+2;
				System.out.println("low is" + low + "high is" + high);
			}
			else if(mid%2 == 0 && arr[mid] == arr[mid-1])
			{
				high=mid-2;
				System.out.println("low is" + low + "high is" + high);
			}
			else if(mid%2 == 1 && arr[mid]==arr[mid+1])
			{
				high=mid-1;
				System.out.println("high is" + high + "low is" + low);
			}
			else if(mid%2 == 1 && arr[mid]==arr[mid+1])
			{
				low=mid+1;
				System.out.println("high is" + high + "low is" + low);
			}
			else
			{
				System.out.println(" in middle" + arr[mid]);
				System.exit(0);
			}
			mid = (low+high)/2;
		}
		
		if(low >=high)
			System.out.println("answer is" +arr[low]);
	}

}
