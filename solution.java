import java.util.Scanner;
public class MissingParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str;
         Scanner scannerObject = new Scanner(System.in);
         str = scannerObject.next();
         int l = 0, r = 0;
         for ( int i = 0 ; i< str.length(); i++)
         {
        	 if (str.charAt(i) == '(') l++;
        	 else
        	 {
        		 if ( l == 0 )
        			 r++;
        		 
        		 else l--;
        	 }
         }
         
         System.out.print(l + r);
         
	}

}
