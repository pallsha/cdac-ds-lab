
public class TestInsertionSort {
	static void sort(int [] arr){
		int key;
		for(int i=1;i<arr.length;i++){
			key=arr[i];
			int j=i-1;
			for(;j>=0;j--){
				if(arr[j]>key){
					arr[j+1]=arr[j];
				}
				else{
					break;
				}
			}
			arr[j+1]=key;
		}

	}
	public static void main (String[] s) {
		int []arr= {9,5,1,4,3};
		sort(arr);
		for(int el: arr) {
			System.out.println(el);
		}
	}
}
