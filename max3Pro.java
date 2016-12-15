import java.util.*;

public class max3Pro{
	public static void main(String[] args) {
		//int arr[] = {6, 1, 2, 3, 19, 10, 7} ;
		//int arr[] = {2,7,8,9};
		int arr[] = {6, 7, 8, 1, 2, 3, 9, 10};
		//find maximum product of three 
		//increasing elemnts must be in subarray
		//approach :-find the largest in left subarray
		//find largest in right  sub array
		//multiply current number with largest in left n right sub arrays
		int maxProduct = 0;
		int product = 1,a1=0,a2=0,a3=0;
		//int tmp[] = new int[3];
		for(int i=1;i<arr.length-1;i++){
			int left = leftLargest(arr,i-1);
			int right = rightLargest(arr,i+1);
			System.out.println("left is "+left+" right is "+right);
			if(left!=-1&&right!=-1){
				 product = left*arr[i]*right;
				if(product>maxProduct){
					maxProduct = product;
					a1=left;
					a2=arr[i];
					a3= right;
				}
			}

			
			
		}
		System.out.println(a1+","+a2+","+a3);
		

	}
	public static int leftLargest(int arr[],int index){
		int largest = -1;
		
		for(int i=0;i<=index;i++){
			if(arr[index]>arr[i]&&arr[i]>largest){
				largest = arr[i];
				
			}
		}
		return largest;
	}

	public static int rightLargest(int arr[],int index){
		int largest = -1;
		
		for(int i=index;i<arr.length;i++){
			if(arr[index]>arr[i]&&arr[i]>largest){
				largest = arr[i];
				
			}
		}
		return largest;
	}
}