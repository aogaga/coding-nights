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

  @ParameterizedTest
  @MethodSource("mergeArraysData")
  void mergeArrays(int[] a, int[] b, int[] expected) {

    int[] actual = solution.mergeArrays(a, b);

    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("findSumData")
  void findSum(int[] arr, int n, int[] expected) {
    int[] acutal = solution.findSum(arr, n);
    assertArrayEquals(expected, acutal);
  }

  @ParameterizedTest
  @MethodSource("findSumData")
  void findSumSorted(int[] arr, int n, int[] expected) {
    int[] actual = solution.findSumSorted(arr, n);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("findProductData")
  void findProduct(int[] arr, int[] expected) {
    int[] actual = solution.findProduct(arr);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("findProductData")
  void findProductOptimized(int[] arr, int[] expected) {
    int[] actual = solution.findProductOptimized(arr);
    assertArrayEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("findMinimumData")
  void findMinimumTest(int[] arr, int actual) {
    int expected = solution.findMinimum(arr);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("findFirstUniqueData")
  void findFirstUniqueTest(int[] arr, int expected) {
    int actual = solution.findFirstUnique(arr);
    assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("findSecondMaximumData")
  void findSecondMaximumTest(int[] arr, int expected) {
    int actual = solution.findSecondMaximum(arr);
    assertEquals(actual, expected);
  }

  @ParameterizedTest
  @MethodSource("rightRotateData")
  void rightRotateTest(int[] arr, int n, int[] expected) {
    int[] actual = solution.rightRotate(arr, n);

    assertArrayEquals(actual, expected);
  }

  @ParameterizedTest
  @MethodSource("rearrangeData")
  void rearrangeTest(int[] arr, int[] expected) {
    int[] actual = solution.rearrange(arr);
    assertArrayEquals(actual, expected);
  }

  /** Test Method Data */
  static Stream<Object[]> rearrangeData() {
    return Stream.of(
        new Object[] {new int[] {5, -2, 7, 3, 0, 8, 0, -6}, new int[] {-2, -6, 5, 7, 3, 0, 8, 0}},
        new Object[] {new int[] {5, -2, 7, 3, 0, 8, 0, -6}, new int[] {-2, -6, 5, 7, 3, 0, 8, 0}});
  }

  static Stream<Object[]> rightRotateData() {
    return Stream.of(
        new Object[] {new int[] {10, 20, 30, 40, 50}, 3, new int[] {30, 40, 50, 10, 20}},
        new Object[] {new int[] {1}, 1, new int[] {1}}
        //        new Object[] {new int[] {1, 2, 3, 4, 5, 6, 7}, 3, new int[] {5, 6, 7, 1, 2, 3,
        // 4}},
        //        new Object[] {new int[] {1, 2, 3, 4, 5, 6}, 10, new int[] {3, 4, 5, 6, 1, 2}},
        //        new Object[] {new int[] {-1, -2, -3, -4, -5}, 0, new int[] {-1, -2, -3, -4, -5}},
        //
        //        new Object[] {new int[] {10, 12}, 1, new int[] {12, 10}}
        );
  }

  static Stream<Object[]> findSecondMaximumData() {
    return Stream.of(
        new Object[] {new int[] {4, 2, 1, 5, 0}, 4},
        new Object[] {new int[] {-2, 9}, -2},
        new Object[] {new int[] {-2, -3, -5, -7}, -3},
        new Object[] {new int[] {2, 9, 5, 4, 0}, 5},
        new Object[] {new int[] {4, -2, 5, -2, 5, 6}, 5}
        //        new Object[] {new int[] {4, 10, 10, 8, 9}, 9}
        );
  }

  static Stream<Object[]> findFirstUniqueData() {
    return Stream.of(
        new Object[] {new int[] {1, 2, 3}, 1},
        new Object[] {new int[] {4}, 4},
        new Object[] {new int[] {2, 2, -6}, -6},
        new Object[] {new int[] {-9, -10, -10, -11, -11}, -9},
        new Object[] {new int[] {5, 5, 6, 6, 7, 8, 9, 9}, 7},
        new Object[] {new int[] {-9, 1, 8, -9, 20, 1, 8}, 20});
  }

  static Stream<Object[]> findMinimumData() {
    return Stream.of(
        new Object[] {new int[] {1, 2, -3, -1, -2}, -3},
        new Object[] {new int[] {-1, -2, 5, 4}, -2},
        new Object[] {new int[] {-1, -2, -3, -4, -10}, -10},
        new Object[] {new int[] {2, 2, 2, 2, 2, 2}, 2},
        new Object[] {new int[] {20, 13, 12, 11, 6, 18, 3}, 3},
        new Object[] {new int[] {-1, 2}, -1});
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

  static Stream<Object[]> mergeArraysData() {
    return Stream.of(
        new Object[] {
          new int[] {1, 3, 4, 5}, new int[] {2, 6, 7, 8}, new int[] {1, 2, 3, 4, 5, 6, 7, 8}
        },
        new Object[] {new int[] {1, 2, 3}, new int[] {4, 5, 6}, new int[] {1, 2, 3, 4, 5, 6}},
        new Object[] {
          new int[] {-1, 3}, new int[] {-1, -1, 0, 0, 1, 2}, new int[] {-1, -1, -1, 0, 0, 1, 2, 3}
        },
        new Object[] {
          new int[] {6, 7, 8, 9, 10},
          new int[] {1, 2, 3, 4, 5},
          new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        },
        new Object[] {
          new int[] {10, 49, 99, 110, 176},
          new int[] {1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100},
          new int[] {1, 2, 4, 7, 8, 10, 12, 15, 19, 24, 49, 50, 69, 80, 99, 100, 110, 176}
        },
        new Object[] {
          new int[] {0, 1, 4, 9},
          new int[] {-111, -20, -5, 5, 11, 20},
          new int[] {-111, -20, -5, 0, 1, 4, 5, 9, 11, 20}
        });
  }

  static Stream<Object[]> findSumData() {
    return Stream.of(
        new Object[] {new int[] {1, 10, 8, 4, 9}, 17, new int[] {8, 9}},
        new Object[] {new int[] {2, 4, 6, 8, 10, 19}, 21, new int[] {2, 19}},
        new Object[] {new int[] {-4, -8, 0, -7, -3, -10}, -15, new int[] {-8, -7}},
        new Object[] {
          new int[] {-1, 9, 56, 12, -13, -6, 23, 19, 71, -56, -14}, -44, new int[] {-56, 12}
        },
        new Object[] {new int[] {3, 3}, 6, new int[] {3, 3}},
        new Object[] {
          new int[] {49, 17, 15, 22, -45, 29, 18, -15, 11, 37, 12, -52}, 0, new int[] {-15, 15}
        });
  }

  static Stream<Object[]> findProductData() {
    return Stream.of(
        new Object[] {new int[] {2, 4, 0, 6}, new int[] {0, 0, 48, 0}},
        new Object[] {new int[] {0, -1, 2, -3, 4, -2}, new int[] {-48, 0, 0, 0, 0, 0}},
        new Object[] {new int[] {5, 3, -1, 6, 4}, new int[] {-72, -120, 360, -60, -90}},
        new Object[] {
          new int[] {-7, 6, 4, 3, 1, 2}, new int[] {144, -168, -252, -336, -1008, -504}
        },
        new Object[] {new int[] {1, 2, 3, 4}, new int[] {24, 12, 8, 6}},
        new Object[] {new int[] {-1, 1}, new int[] {1, -1}});
  }
}
