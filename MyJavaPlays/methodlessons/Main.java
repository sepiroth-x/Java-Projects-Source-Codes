public class Main {

    public static void main(String[] args) {
        //methods:
        //void methods
        //methods with arguments or parameters
        //methods that are not void
        //method overloading

      helloMessage();
      helloMessage(10);
      helloMessage(5,"Cuerda");
      helloMessage(3,"Benitez",'#');
    
    }   
    
   public static void helloMessage() {

    System.out.println("Method with no argument");

   }

  public static void helloMessage(int a) {

    System.out.println("Method with one argument");

   }

  public static void helloMessage(int a, String name) {

    System.out.println("Method with two arguments");

   }

 public static void helloMessage(int a, String name, char z) {

    System.out.println("Method with three arguments");

   }


   
}
