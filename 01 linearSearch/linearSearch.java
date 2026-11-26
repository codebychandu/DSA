

/*
Linear Search: Linear Search is a way to search a number from array by travercing each number one by one this process is called linear Search.
*/
public class linearSearch {

   public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 4, 5 };
      int find = 4;
      for (int i = 0; i < arr.length; i++) {
         if (find == arr[i]) {
            System.out.println("Number " + find + " found On: " + i + " index");
         }

      }
   }
}
