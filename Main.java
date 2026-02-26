public class Main {

   public static void main(String []args) {
      

      //4.7 WRAPPER CLASSES wrap primative into objects
      //why? some methods NEED objects! 
      Integer fancyInt = new Integer(13); 
      Double fancyDoub= new Double (13.0);
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




      //list.get(int index) returns the item
      //at that specialized index
      String firstItem = toDo.get(0);
      //the return type matches what the array list holds
      System.out.print("Do this first:" + firstItem);

      //list.set(int index, obj newItem) 
      //replace item at the index with a new one 
      String replacedItem = toDo.set(0, "Finish HW");
      System.out.println(toDo);
      System.out.println("We replaced;" + replacedItem);

      //list.remove(int index) delete the item at that index 
      //shifting eveyrthing else back one number 
      //also returns the removed item! (called E on the quick ref)

      String removedItem = toDo.remove(2);
      System.out.println(toDo);
      System.out.println("We removed the item:" + removedItem);

   }//END MAIN METHOD 
} // END CLASS
