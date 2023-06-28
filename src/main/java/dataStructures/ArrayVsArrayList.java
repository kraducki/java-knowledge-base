package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
   public static void main(String[] args) {
      // Arrays have fixed size
      // They can hold anything - primitives or objects
      String[] friendsArray = new String[4];
      String[] friendsArray2 = {"A", "B", "C"};
      System.out.println(friendsArray[0]);
      System.out.println(friendsArray.length);
      friendsArray[0] = "Z";

      // Won't work
      System.out.println(friendsArray);


      // ArrayList grows and shrinks automatically
      // ArrayList can hold only objects
      ArrayList<String> friendsArrayList = new ArrayList<>();
      ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
      System.out.println(friendsArrayList2.get(0));
      System.out.println(friendsArrayList.size());
      friendsArrayList.add("D");
      friendsArrayList.set(0, "Z");
      friendsArrayList.remove("B");

      System.out.println(friendsArrayList);

   }
}
