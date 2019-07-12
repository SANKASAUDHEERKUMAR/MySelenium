package My_Project;

public class ArraySorting {

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=0;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int[] arr= {21,35,5,45,95,84,64,24,15,16,34};
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
