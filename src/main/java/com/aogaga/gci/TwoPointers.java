/*
 * Copyright 2024 Ogheneogaga Fidelis Agi (aogaga@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aogaga.gci;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoPointers {

  public int[] reverseArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    int a = 0;
    int b = 0;

    while (start < end) {
      a = arr[start];
      b = arr[end];
      arr[start++] = b;
      arr[end--] = a;
    }
    return arr;
  }

  public boolean isPalindrome(String str) {
    int start = 0;
    int end = str.length() - 1;

    while (start < end) {
      if (str.charAt(start) != str.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  public boolean findSumOfThree(int[] nums, int target) {
    boolean result = false;
    int count = 0;
    int b = 0;
    int c = 0;
    int sum = 0;
    if (nums.length < 3) {
      return false;
    }

    if (nums.length == 3) {
      return ((nums[0] + nums[1] + nums[2]) == target);
    }
    while (count < nums.length - 2) {

      b = count + 1;
      c = count + 2;
      sum = nums[count] + nums[b] + nums[c];
      System.out.println(count);
      if (sum == target) {
        result = true;
      }
    }
    return result;
  }

  public int[] sortColors(int[] colors) {
    Set<Integer> set = new HashSet<Integer>();

    for (int i : colors) {
      set.add(i);
    }

    int counter = 0;
    int[] results = new int[colors.length];

    for (int x : set) {

      for (int i : colors) {
        if (i == x) {
          results[counter++] = x;
        }
      }
    }

    return results;
  }

  public int[] sortColorsv2(int[] colors) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int x : colors) {
      if (map.containsKey(x)) {
        map.replace(x, (map.get(x) + 1));
      } else {
        map.put(x, 1);
      }
    }

    int counter = 0;

    for (Map.Entry<Integer, Integer> item : map.entrySet()) {
      int n = item.getValue();

      for (int i = 1; i <= n; i++) {
        colors[counter++] = item.getKey();
      }
    }

    return colors;
  }

  public String reverseWords(String sentence) {
    StringBuilder result = new StringBuilder();

    String[] words = sentence.split(" ");

    for (String str : words) {
      result.insert(0, str);
      result.insert(0, " ");
    }

    return result.toString().trim();
  }
}
