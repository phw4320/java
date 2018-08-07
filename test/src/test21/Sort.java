package test21;

import java.util.Scanner;

public class Sort {

   /**
    * @param args
    */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("숫자를 \",\"를 구분자로 입력해주세요.");
      String numStr = scan.nextLine();
      String[] numStrs = numStr.split(",");
      int[] nums = new int[numStrs.length];
      for (int i = 0; i < numStrs.length; i++) {
         nums[i] = Integer.parseInt(numStrs[i]);
         // System.out.println(numStrs[i]);
      }

      for (int j = 0; j < numStrs.length; j++) {
         for (int k = 0; k < numStrs.length; k++) {
            if (nums[j] < nums[k]) {
               int tem = nums[j];
               nums[j] = nums[k];
               nums[k] = tem;
            }

         }
         
      }
      for(int i=nums[0]; i<nums[nums.length-1]; i++) {
          System.out.println(i);
      }
      scan.close();
     /*System.out.println(nums[0]);
      System.out.println(nums[nums.length-1]);*/
      /*for(int z=nums[0];z<nums[numStrs.length-1];z++) {
         System.out.println(z);
      }*/
     /* for(int i=0; i<nums.length; i++) {
         System.out.println(i);
      }*/
   }
}