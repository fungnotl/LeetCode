package cn.fungnotl;

/**
 * @project LeetCode
 * @auther fungnotl
 * @date 2020-02-13-18-03
 * @description:
 */

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

 示例:
 给定 nums = [2, 7, 11, 15], target = 9
 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]

 */
public class SumOfTwo {

    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 2, 1, 9, 8};
        int[] result = twoSum(nums, 10);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.get(dif) != null){
                res[0] = map.get(dif);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }



    //暴力法
//    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }


}
