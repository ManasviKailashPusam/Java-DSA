 import java.util.Scanner;
  public class Main
  {
      public static int lemonade(int[]bills)
      {
          int five=0;
          int ten=0;
          for(int bill:bills)
          {
              if(bill==5)
              {
                  five++;
              }
              else if(bill==10)
              {
                  if(five==0)
                  {
                      return false;
                  }
                  ten++;
                  five--;
              }
              else if(bill==20)
              {
                  if(five>=1   &&  ten>=1)
                  {
                      five--;
                      ten--;
                  }
                  else if(five>=3)
                  {
                      five-=3;
                  }
                  else
                  {
                      return false;
                  }
              }
          }
          return true;
      }
  }
