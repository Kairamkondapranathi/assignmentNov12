package assignments;

public class ReverseOfString {
      static String reverse_string(String str) {
    	  if(str.length() == 0)
    		  return str;
    	  
    	  return reverse_string(str.substring(1)) + str.charAt(0);
      }
      
      public static void main(String[] args) {
    	  String str="chirag";
    	  System.out.println(reverse_string(str));
      }
}