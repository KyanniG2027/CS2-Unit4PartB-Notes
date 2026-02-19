public class Main {

   public static void main(String []args) {
      

      //4.7 WRAPPER CLASSES wrap primative into objects
      //why? some methods NEED objects! 
      Integer fancyInt = new Integer(13); 
      Double fancyDoub= new Double (13.0)
      //calling the constructor is no longer necessary!
      //can just declare them like you would primitives:
      Integer fancierInt = 13; 
      System.out.println(fancierInt); 
      //AUTOBOXING: Java converts int to Integer
      // (we passed 13, a primitive value, then Java promoted it 
      //  to an integer )
      int regularInt= fancierInt; //UNBOXING 

      // Another benefit of Wrappers: you can use some methods 
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);
      String straightNums = "13.0"; 
      double parsedD = Double.parseDouble(straightNums);
      System.out.println(parseD);
      String stringyNums2 = "13";
      int parsedI = Integer.parseInt(stringyNums2);
      System.out.println(parsedI);
   }
}
