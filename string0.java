public class string0 {
    public static void main(String args []){
            String str="sheezal";
            //String org= str;
            //System.out.println(str.charAt(0));
           // System.out.println(str.charAt(3));

            for(int i=0;i<str.length();i++){
                //rev+=str.charAt(i);
                 System.out.print(str.charAt(i) + " " );
            }
          // System.out.println();
           String rev="";
           System.out.println();
            for(int i=str.length()-1;i>=0;i--)
            {
                rev+=str.charAt(i);
               //System.out.print(str.charAt(i)+ " ");
            }
            System.out.println(rev + " ");
            if(str.equals(rev))
            {
                  System.out.println("is  a palindrome ");
            }
            else 
            System.out.println("Not a palindrome");
           
            String newstr="";
            for(int i=0;i<str.length();i++){
                char c= str.charAt(i);

                if (newstr.indexOf(c)==-1){
                    newstr+=c;
                }
            }
            System.out.println(newstr);

           // String str="eye";
          // String  str="hello";
          //String str=new String ("hello");
         //String str1=new String("hello");   
         //System.out.println(str=str1);    
         //String newString=str+"";

                // Print the first letter of the given string which is repeating only the first repeating alphabet 

                String str2="sheezall";
                char ch[]= str2.toCharArray();
                for (int i=0;i<ch.length;i++)
                {
                  System.out.print(ch[i]+" ");
            }
            System.out.println();
            System.out.println("The two repeating character is: ");
            for(int i=0;i<ch.length;i++){
                  for(int j=i+1;j<ch.length;j++){
                     if (ch[i]==ch[j])
                     {
                        System.out.println(ch[i]);
                        break;
                     }
                  }
            }

    }
}
