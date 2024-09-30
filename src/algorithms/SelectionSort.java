package algorithms;

public class SelectionSort {
	public static void main(String[] args) {
		int nums[]= {2,1,3,5,8,6,4};
		int size=nums.length;
		int temp=0;
		System.out.println("Before Sorting : ");
		for(int num:nums)
		{
			System.out.print(num+" ");
		}
		//Selection Sort
		for(int i=0;i<size-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<size;j++)
			{
				if(nums[minIndex]>nums[j])
				{
					minIndex=j;
				}
			}
			temp=nums[minIndex];
			nums[minIndex]=nums[i];
			nums[i]=temp;
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int num:nums)
		{
			System.out.print(num+" ");
		}
		}
}
