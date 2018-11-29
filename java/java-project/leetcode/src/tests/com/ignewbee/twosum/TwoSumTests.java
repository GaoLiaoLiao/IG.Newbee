package com.ignewbee.twosum;

import org.junit.Test;

/**
 * @author star
 * @Date 2018/11/29.
 * @Description: No Description Yet.
 */
public class TwoSumTests {

  @Test
  public void normal(){
    TwoSum twoSum = new TwoSum();
    int[] res = twoSum.twoSum(new int[]{1,2,3,4,5,6}, 3);
    assert res[0] == 0;
    assert res[1] == 1;
  }
}
