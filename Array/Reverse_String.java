
import java.util.*;
import java.io.*;
import java.lang.*;

class Reverse_String
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}



class Reverse
{
    
    public static String reverseWord(String str)
    {
      String S1 ="";
      char ch; 

      for(int i=0; i<str.length(); i++)
      {
        ch=str.charAt(i);
        S1 = ch+S1;
      }
      return S1;
    }
}