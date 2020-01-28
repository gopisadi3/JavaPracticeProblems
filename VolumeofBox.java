//Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions are width, height, depth of double type).
//The class should have a method that can return volume. Obtain an object and print the corresponding volume in main() function. 

public class Box
{
      double width;
      double height;
      double depth;
         Box()
      {
      }

      Box(double width , double height, double depth)
      {
              this.width=width;
              this.depth=depth;
              this.height=height;
      }
        
       void store(double width , double height, double depth)
       { 
              this.width=width;
              this.depth=depth;
              this.height=height;
       }

      double volume()
      {
               return width*depth*height;
      }

      public static void main(String args[])
      {
                Box B=new Box();
                B.store(1.0,2.0,3.0);
                System.out.println("The volume of box is: "+B.volume());

                Box B1=new Box(1.0,2.0,3.0);
                System.out.println("The volume of box is: "+B1.volume());
      }

}
