package assignments;

public class SumOfArray {
	static int sum_array(int a[], int n) {
		if(n<=0) {
			return 0;
		}
		return sum_array(a, n-1) + a[n-1];
	}
      
	  public static void main(String[] args) {
		  int a[]= {1,2,5,5,10};
		System.out.println(sum_array(a,a.length));
	  }
}
