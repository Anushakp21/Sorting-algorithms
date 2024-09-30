package algorithms;

public class InsertionSort {
	public static void main(String[] args) {
		int nums[]= {2,4,3,1,5,8,7,6,9};
		System.out.println("Before Sorting : ");
		for(int num:nums)
		{
			System.out.print(num+" ");
		}
		//Insertion Sort
		for(int i=0;i<nums.length-1;i++)
		{
			int key=nums[i];
			int j=i-1;
			while(j>=0 && nums[j]>key)
			{
				nums[j+1]=nums[j];
				j--;
			}
			nums[j+1]=key;
			
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int num:nums)
		{
			System.out.print(num+" ");
		}
	}

}
