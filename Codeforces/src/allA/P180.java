package allA;


public class P180 {
	public static int check(int[] arr, int target) {
		int inv_count = 0;
		for (int i = 0; i <= target-1; i++){
			for(int j = i + 1; j < target; j++){ 
                if (arr[i] > arr[j]) { 
                    inv_count++;
                }
		}
		}
		return inv_count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 5;
		int myArray[] = {2,3,1,5,4};
		System.out.println(check(myArray, target));
	}

}
