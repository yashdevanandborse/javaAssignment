import static java.lang.Integer.max;
import java.util.Scanner;
class Pythagoras
{
    public static void main(String[] args)  
    { 
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sr.nextInt();
        }
        int a,b,c;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=i+2;k<n;k++)
                {
                  a = arr[i];
                  b = arr[j];
                  c = arr[k];
                  if(a*a + b*b == c*c) 
                    System.out.println(a +"  "+b+"  "+c);
                }
              }
          }
    }
}