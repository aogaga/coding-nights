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
package com.aogaga.dsfciij;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArraySolution {

  public int[] removeEven(int[] arr) {

    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException();
    }
    List<Integer> resultHolder = new ArrayList<>();

    for (int i : arr) {
      if (i % 2 != 0) {
        resultHolder.add(i);
      }
    }

    int[] result = new int[resultHolder.size()];
    for (int i = 0; i < result.length; i++) {
      result[i] = resultHolder.get(i);
    }

    return result;
  }

  public int[] mergeArrays(int[] array1, int[] array2) {
    int a = 0;
    int b = 0;
    int counter = 0;

    List<Integer> resultHolder = new ArrayList<>();

    while (a < array1.length && b < array2.length) {
      if (array1[a] == array2[b]) {
        resultHolder.add(array1[a++]);
        resultHolder.add(array2[b++]);
      } else if (array1[a] < array2[b]) {
        resultHolder.add(array1[a++]);
      } else {
        resultHolder.add(array2[b++]);
      }
    }

    if (a < array1.length) {
      while (a < array1.length) {
        resultHolder.add(array1[a++]);
      }
    }

    if (b < array2.length) {
      while (b < array2.length) {
        resultHolder.add(array2[b++]);
      }
    }
    int[] result = new int[resultHolder.size()];
    for (int i = 0; i < result.length; i++) {
      result[i] = resultHolder.get(i);
    }
    return result;
  }

  public int[] findSum(int[] arr, int n) {
    int[] result = new int[2];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == n) {
          result[0] = arr[i];
          result[1] = arr[j];
          break;
        }
      }
    }
    Arrays.sort(result);
    System.out.println(Arrays.toString(result));
    return result;
  }

  public int[] findSumSorted(int[] arr, int n) {
    Arrays.sort(arr);

    int start = 0;
    int end = arr.length - 1;
    int[] result = new int[2];

    while (start < end) {
      if ((arr[start] + arr[end]) == n) {
        result[0] = arr[start];
        result[1] = arr[end];
        break;
      } else if ((arr[start] + arr[end]) < n) {
        start++;
      } else {
        end--;
      }
    }

    return result;
  }

  public int[] findProduct(int[] arr) {
    int[] result = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      double product = 1;
      for (int j = 0; j < arr.length; j++) {
        if (i != j) {
          product *= arr[j];
        }
      }

      result[i] = (int) product;
    }

    return result;
  }

  public int[] findProductOptimized(int[] arr) {
    int left = 1;
    int right = 1;
    int n = arr.length;
    int[] result = new int[arr.length];

    for (int i = 0; i < n; i++) {
      result[i] = left;
      left *= arr[i];
    }

    for (int i = n - 1; i >= 0; i--) {
      result[i] *= right;
      right *= arr[i];
    }
    return result;
  }

  public int findMinimum(int[] arr) {
    int min = Integer.MAX_VALUE;
    for (int x : arr) {
      if (x < min) {
        min = x;
      }
    }
    return min;
  }

  public int findFirstUnique(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int n : arr) {
      if (!map.containsKey(n)) {
        map.put(n, 1);
      } else {
        map.replace(n, (map.get(n) + 1));
      }
    }

    for (int x : arr) {
      if (map.get(x) == 1) {
        return x;
      }
    }
    return 0;
  }

  public int findSecondMaximum(int[] arr) {
    int max = Integer.MIN_VALUE;
    int max2 = max + 1;

    for (int x : arr) {
      if (x > max) {
        max2 = max;
        max = x;
      } else {
        if (x > max2) {
          max2 = x;
        }
      }
    }

    return max2;
  }

  public int[] rightRotate(int[] arr, int n) {
    int[] nums = new int[arr.length];

    int x = 0;

    for (int i = n - 1; i < arr.length; i++) {
      System.out.println(arr[i]);
      nums[x++] = arr[i];
    }

    for (int i = 0; i < n - 1; i++) {
      nums[x++] = arr[i];
    }

    System.out.println(Arrays.toString(nums));
    return nums;
  }

  public int[] rearrange(int[] arr) {
    int[] result = new int[arr.length];
    int x = 0;
    for (int i : arr) {
      if (i < 0) {
        System.out.println(x);
        result[x++] = i;
      }
    }

    for (int i : arr) {
      if (i >= 0) {
        result[x++] = i;
      }
    }

    return result;
  }
}
