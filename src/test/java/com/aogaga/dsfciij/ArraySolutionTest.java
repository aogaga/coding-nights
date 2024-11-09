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

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ArraySolutionTest {

  ArraySolution solution;

  @BeforeEach
  void setUp() {
    solution = new ArraySolution();
  }

  @AfterEach
  void tearDown() {}

  @ParameterizedTest
  @MethodSource("removeEvenData")
  void removeEven(int[] arr, int[] expected) {
    int[] result = solution.removeEven(arr);
    System.out.println(Arrays.toString(result));
    assertArrayEquals(expected, result);
  }

  static Stream<Object[]> removeEvenData() {
    return Stream.of(
        new Object[] {new int[] {1, 3, -2, 4, 7}, new int[] {1, 3, 7}},
        new Object[] {new int[] {0, 20, 41}, new int[] {41}},
        new Object[] {new int[] {2, 4, 6, 8, 10, 13, 15}, new int[] {13, 15}},
        new Object[] {new int[] {1, 3, 5, 7, 9}, new int[] {1, 3, 5, 7, 9}},
        new Object[] {new int[] {0}, new int[] {}},
        new Object[] {new int[] {1, 22, 45, 33, 19, 32}, new int[] {1, 45, 33, 19}});
  }

  @ParameterizedTest
  @MethodSource("mergeArraysData")
  void mergeArrays(int[] a, int[] b, int[] expected) {

    int[] actual = solution.mergeArrays(a, b);

    assertArrayEquals(expected, actual);
  }

  static Stream<Object[]> mergeArraysData() {
    return Stream.of(
        new Object[] {
          new int[] {1, 3, 4, 5}, new int[] {2, 6, 7, 8}, new int[] {1, 2, 3, 4, 5, 6, 7, 8}
        },
        new Object[] {
          new int[] {1, 3, 4, 5}, new int[] {2, 6, 7, 8}, new int[] {1, 2, 3, 4, 5, 6, 7, 8}
        });
  }
}
   // new int[] {}, ,
