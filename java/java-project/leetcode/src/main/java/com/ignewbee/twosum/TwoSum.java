package com.ignewbee.twosum;


import java.util.HashMap;
import java.util.Map;

/**
 * @author star
 * @Date 2018/11/29.
 * @Description: No Description Yet.
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    if(nums == null || nums.length < 2){
      return null;
    }

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int diff = target - nums[i];
      Integer index2 = map.get(diff);
      if(index2 == null || i == index2){
        continue;
      }
      return new int[]{i, index2};
    }

    return null;
  }
}
