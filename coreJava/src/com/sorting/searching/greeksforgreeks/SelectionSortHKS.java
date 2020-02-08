package com.sorting.searching.greeksforgreeks;
public class SelectionSortHKS {
	void sortData(int a[]) {
		int len = a.length;
		for(int i=0;i<len; i++) {
			int min_idx=i;
			for(int j=i+1; j<len; j++) //{
				if(a[j] < a[min_idx]) {
					min_idx=j;
				}
				int temp =a[i];
				a[i]=a[min_idx];
				a[min_idx]=temp;
			//}
		}
	}
	void printSort(int a[]) {
		int len=a.length;
		for(int i=0; i<len; i++) {
			System.out.print(a[i] +" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {40,3,100,50,10,37,101,49};
		SelectionSortHKS sort =new SelectionSortHKS();
		sort.sortData(a);
		sort.printSort(a);
	}

}
