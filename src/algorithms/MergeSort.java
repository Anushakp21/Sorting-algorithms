package algorithms;

public class MergeSort {
	public static void main(String[] args) {
		int arr[]= {2,3,1,5,6};
		System.out.println("Before Sorting : ");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		int n=arr.length;
		divide(arr,0,n-1);
		System.out.println();
		System.out.println("After Sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	static void divide(int[] arr, int si, int ei) {
		int mid=si+(ei-si)/2;

		if(si<ei)
		{
		divide(arr,si,mid);
		divide(arr,mid+1,ei);

		merge(arr,si,mid,ei);
		}
	}
	static void merge(int[] arr, int si, int mid, int ei) {
		int merge[]=new int[ei-si+1];
		int x=0;
		int idx1=si;
		int idx2=mid+1;
		while(idx1<=mid && idx2<=ei)
		{
			if(arr[idx1]<arr[idx2])
			{
				merge[x++]=arr[idx1++];
			}
			else
			{
				merge[x++]=arr[idx2++];
			}
		}
		while(idx1<=mid)
		{
			merge[x++]=arr[idx1++];
		}
		while(idx2<=ei)
		{
			merge[x++]=arr[idx2++];
		}
		for(int i=0;i<merge.length;i++)
		{
			arr[si + i] = merge[i];
		}
	}
}
