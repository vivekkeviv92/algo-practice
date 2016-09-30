package test;

public class InsertionSortOwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,6,1,0,-1,99};
		int i,j;
		for(j=1;j<arr.length;j++)
			{
			int key=arr[j];
			i=j-1;
			while(i>=0 && arr[i]>key)
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
			}

		for(i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

}
