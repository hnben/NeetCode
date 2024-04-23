package ArraysHashing;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] result = twoSumBruteForce(new int[]{2,7,11,15}, 22);
        System.out.println(Arrays.toString(result));

        result = twoSumHashSet(new int[]{2,7,11,15}, 22);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSumBruteForce(int[] nums, int target){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * Utilizes the complement of a number for example:
     * Target = 9, index of first number is = 1, you're only looking for
     * the complement aka the other number if it exists or not i.e 9-1 = 8,
     * here you're looking for the value 8 within the hashmap
     *
     *
     * hashmap, mapping the value to the index position <Key, Value> <Value, Index>
     * @param nums the
     * @param target
     * @return
     */
    public static int[] twoSumHashSet(int[] nums, int target){
        HashMap<Integer, Integer> prevMap = new HashMap<>(); //value : index

        //loop through the nums array
        for (int i=0; i < nums.length ; i++){

            int complement = target - nums[i];

            if (prevMap.containsKey(complement)){
                return new int[]{prevMap.get(complement), i};
            }

            prevMap.put(nums[i], i);
        }
        return new int[]{};
    }


}
