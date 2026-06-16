import java.util.Scanner;
 public class Main
 {
     public static boolean isValid(String s)
     {
         Stack<String>st=new Stack<>();
         for(int i=0;i<n;i++)
         {
             char ch=s.charAt(i);
             if(ch=='('   || ch=='{'    ||   ch=='[')
             {
                 st.push(ch);
             }
             else
             {
                 if(st.isEmpty())
                 {
                     return false;
                 }
                  char top=st.pop();
                 if((ch==')')   &&   st.top!='(' || (ch=='}')   &&   st.top!='}'  (ch==']')   &&   st.top!='[')
                 {
                     return false;
                 }
             }
              return (st.isEmpty())
              
         }
     }
 }
