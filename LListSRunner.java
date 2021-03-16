//Name:
//Lab 9A Main
//DO NOT MODIFY Class code

public class LListSRunner
{
   public static void main(String[] arg)
   {
      LList one = new LList();
      one.add(1);
      one.add(2);
      one.add(3);
      one.add(4);
      
      LList two = new LList();
      two.addH(10);
      two.addH(9);
      two.addH(8);
      two.addH(7);
      two.addH(6);
      
      System.out.println("Test 1");
      System.out.println("Original LList:");
      System.out.println(one);
      one.reverse();
      System.out.println("Reversed LList:");
      System.out.println(one);
      System.out.println("\n");
      
      System.out.println("Test 2");
      System.out.println("Original LList:");
      System.out.println(two);
      two.reverse();
      System.out.println("Reversed LList:");
      System.out.println(two);
   }
}