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

      // 4.8 ARRAYLIST 
      /* ArrayList is a RE-SIZABLE collection 
         You can ADD or REMOVE items from lists! 
         ArrayList is MUTABLE (can change during run) 
      */

      // ArrayList<Type> name = new ArrayList<Type>();
      
      ArrayList<String> toDo = new ArrayList<String>(); 
      // For numbers, must WRAPPER classes (not primitives!) 
      ArrayList<Integer> intList = new ArrayList<Integer>(); 
      ArrayList<Double> dubList = new ArrayList<Double>(); 

      // ARRAYLIST METHODS (assume "list" is an ArrayList) 
      // the number of items in the list 
      int numTasks = toDo.size(); 
      System.out.println("Number of items on To Do list: " + numTasks); 

      // list.add(obj) appends the obj to end of list
      // returns a boolean, but that's not important 
      toDo.add("build robot"); 
      toDo.add("do homework"); 
      toDo.add("sleep"); 
      // check size after adding stuff 
      System.out.println(toDo.size()); 
      // check size after adding stuff
      System.out.println("Number of items after adding: " + toDo.size()); 
      System.out.println(toDo); // ArrayList has a nive toString method!!! 

      // list.add(index, obj) inserts the obj 
      // AT a specific INDEX! (position)
      toDo.add(1, "finish school"); 
      System.out.println(toDo); 
      // REMEMBER that indexes start at 0 
      // so 1 means we added to the SECOND spot

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
