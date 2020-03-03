import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Experiment shuffling an array of integers.
 */
public class Solution {

  /**
   * Shuffle an array of integers.
   * Runs in O(n) time.
   */
  static int[] shuffle(int[] arr) {

    // **** used to shuffle the array ****
    List<Integer> al = new ArrayList<Integer>();

    // **** populate the array list: O(n) ****
    for (int i = 0; i < arr.length; i++) {
      al.add(arr[i]);
    }

    // **** shuffle the array list: O(log(n)) ****
    Collections.shuffle(al);

    // **** copy the array list elements to the array: O(n) ****
    for (int i = 0; i < al.size(); i++) {
      arr[i] = al.get(i);
    }

    // **** returned shuffled array ****
    return arr;
  }


  /**
   * Test scaffolding.
   */
  public static void main(String[] args) {
    
    // **** declare array of int ****
    int[] arr = { -7, 8, 2, -4, 0, 3, 5 };

    // **** display array ****
    System.out.println("main <<<  initial arr: " + Arrays.toString(arr));

    // **** sort the array ****
    Arrays.sort(arr);

    // **** display sorted array ****
    System.out.println("main <<<   sorted arr: " + Arrays.toString(arr));
  
    // **** shuffle the array ****
    arr = shuffle(arr);

    // **** display shuffled array ****
    System.out.println("main <<< shuffled arr: " + Arrays.toString(arr));
  }
}