package recursion;

public class MoveAllXToEns {
	public static void main(String[] args) {
		String s="abxyqxixxbnxix";
		int idx=0,count=0;
		String newStr="";
		MoveX(s,idx,count,newStr);
	}

	private static void MoveX(String s, int idx, int count, String newStr) {
		
		if(idx==s.length())
		{
			while(count>0)
			{
				newStr+='x';
				count--;
			}
			System.out.println(newStr);
		}
		else if(s.charAt(idx)=='x')
		{
			count++;
			MoveX(s, idx+1, count, newStr);
		}
		else {
			newStr+=s.charAt(idx);
			MoveX(s, idx+1, count, newStr);
		}
			
		
	}

}
