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
}
