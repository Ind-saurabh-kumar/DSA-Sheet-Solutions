public class Reverse_String{
      public static void main(String []args)
      {
        String str = "Hello World";
        System.out.println("Original String : "+str);
        // Using StringBuilder reverse() method
        System.out.println(new Reverse().reverseStr(str));
      }
}


class Reverse{
  public static String reverseStr(String str){
  String rev="";
  for (int i=str.length()-1; i>=0; i--)
  {
    rev +=str.charAt(i);
  }
  return rev;
  }
}