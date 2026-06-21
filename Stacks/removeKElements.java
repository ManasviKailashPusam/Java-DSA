import java.util.Scanner;
public class Main
{
public String removeKdigits(String num,int k)
{
for(char ch:numToCharArray())
{
 while(!st.isEmpty()   &&  k>0  &&  st.peek()>ch)
{
 st.pop();
k--;
}
st.push(ch);
}
while(k>0)
{
st.pop();
k--;
}
StringBuilder sb=new StringBuilder();

while(!st.isEmpty())
{
sb.append(st.pop());
}
sb.reverse;
while(sb.length()>0   &&  sb.charAt(0)=='0')
{
sb.deletecharAt(0);  
}
return sb.length()==0?"0":sb.toString();
}
}

