package recursion;

public class MinimumArray {
public static void main(String[] args) {
		
		int s[]= {3,2,7,8,9,0,1};
		int idx=0;
		int min=Integer.MAX_VALUE;
		
		int min1=FindMin(s,idx,min);
		System.out.println(min1);

	}

	private static int FindMin(int[] s, int idx,int min) {
		if(idx==s.length)
		{
			return min;
		}
		
		if(s[idx]<min)
		{
			min=s[idx];
			return FindMin(s, idx+1, min);
		}
		else
			return FindMin(s, idx+1, min);
	}


}
