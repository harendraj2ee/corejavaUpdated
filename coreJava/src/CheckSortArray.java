import java.util.Arrays;

public class CheckSortArray {
	public static void main(String[] args) {
		//sortArray();
		int a[]={};
		sortArray(a);
		sortArrayNoReturnNoParam();
	}
	static int[] sortArray(int arr1[]) {
		System.out.println(" Simple Arrays...");
		int arr[] = {10,20,60,40,30,100,80,500,200,200,100,200,4,7,9,8,1,1};

		for(int loop:arr) {
			Arrays.sort(arr);
			System.out.print(loop+" ");
		}
		System.out.println(" ");
		Arrays.sort(arr);
		System.out.println("After sorting with Param and return....");

		for(int loop:arr) {
			Arrays.sort(arr);
			System.out.print(loop +" ");
		}
		return arr;
	}
	static void sortArrayNoReturnNoParam() {
		System.out.println("  ");
		int arr2[]= {6,2,34,9,4,7,8,5,3,0,55,33};
		System.out.println("No Param no Return types.....");
		for(int loop:arr2) {
			Arrays.sort(arr2);
			System.out.print(loop+" ");
		}
		System.out.println(" ");
		Arrays.sort(arr2);
		System.out.println("After sorting arrays..");
		for(int loop:arr2) {
			Arrays.sort(arr2);
			System.out.print(loop+" ");
		}
	}

}
