package com.ignewbee.twosum;

import com.ignewbee.longestPalindrome.LongestPalindrome;
import org.junit.Test;

/**
 * @author star
 * @Date 2018/12/15.
 * @Description: No Description Yet.
 */
public class LongestPalindromeTest {

  @Test
  public void test(){
    LongestPalindrome longestPalindrome = new LongestPalindrome();
    System.out.println(longestPalindrome.longestPalindrome("abcdefbcbc"));
    assert "cbc".equals(longestPalindrome.longestPalindrome("abcdefbcbc"));
    System.out.println(longestPalindrome.longestPalindrome("babad"));
    assert "aba".equals(longestPalindrome.longestPalindrome("babad"));
  }

}
