//greatestofarray

public class GreatestOfArray
{
     public static void main(String args[])
     {

           
           if(args.length==9)
          {
                  int[][] arr=new int[3][3];
                  
                  int max=-1;
                  int c=0;
                  for(int i=0;i<3;i++)
                  {
                          for(int j=0;j<3;j++)
                          {
                            	arr[i][j]=Integer.parseInt(args[c]);
                                c++;
                                if(max< arr[i][j])
                                       max=arr[i][j];
                          }
                  }
                  System.out.println("The given array  : ");
                  for(int i=0;i<3;i++)
                  {
                          for(int j=0;j<3;j++)
                          {
                                 System.out.print(arr[i][j]+" ");
                          }
                          System.out.println();
                  }
                  System.out.print("The biggest number in  array is "+max);
          }
          else
          {
                  System.out.println(" Please enter 9 integer values ");
          }

     }
}
