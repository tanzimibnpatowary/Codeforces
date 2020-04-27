package two;

public class P231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 15,count=0,firsNumber = 2, secondnumber = 3,sum=0;
		for (int i = 2; i <=target; i++) {
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					count = 1;
					break;
				}
			}
			if (count==0) {
				if (sum<target) {
					sum=firsNumber+secondnumber;
					firsNumber=secondnumber;
					secondnumber=i;
				}
			}
			count=0;
		}
		System.out.println(sum);
	}

}
