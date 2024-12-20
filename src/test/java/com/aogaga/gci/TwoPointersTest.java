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

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class TwoPointersTest {
  TwoPointers twoPointers;

  @BeforeEach
  void setUp() {
    twoPointers = new TwoPointers();
  }

  @AfterEach
  void tearDown() {}

  @ParameterizedTest
  @MethodSource("reverseArrayData")
  void reverseArray(int[] arr, int[] expected) {
    int[] actual = twoPointers.reverseArray(arr);
    assertArrayEquals(actual, expected);
  }

  @ParameterizedTest
  @MethodSource("isPalindromeData")
  void isPalindrome(String str, boolean expected) {
    boolean actual = twoPointers.isPalindrome(str);
    assertEquals(actual, expected);
  }

  @ParameterizedTest
  @MethodSource("findSumOfThreeData")
  void findSumOfThree(int[] arr, int n, boolean expected) {
    boolean actual = twoPointers.findSumOfThree(arr, n);
    assertEquals(actual, expected);
  }

  @ParameterizedTest
  @MethodSource("sortColorsData")
  void sortColorsTest(int[] colors, int[] expected) {
    int[] actual = twoPointers.sortColors(colors);
    assertArrayEquals(actual, expected);
  }

  @ParameterizedTest
  @MethodSource("sortColorsData")
  void sortColorsTestV2(int[] colors, int[] expected) {
    int[] actual = twoPointers.sortColorsv2(colors);
    assertArrayEquals(actual, expected);
  }

  @ParameterizedTest
  @MethodSource("reverseWordsData")
  void reverseWordsTest(String sentence, String expected) {
    String actual = twoPointers.reverseWords(sentence);
    assertEquals(actual, expected);
  }
  /// Test data
  static Stream<Object[]> findSumOfThreeData() {
    return Stream.of(
        new Object[] {new int[] {2, 3, 1}, 6, true},
        new Object[] {new int[] {1, -1, 0}, -1, false},
        //  new Object[] {new int[] {3, 7, 1, 2, 8, 4, 5}, 10, true},
        //        new Object[] {new int[] {3, 7, 1, 2, 8, 4, 5}, 21, false},
        new Object[] {new int[] {-1, 2, 1, -4, 5, -3}, -8, true},
        new Object[] {new int[] {-1, 2, 1, -4, 5, -3}, 0, true});
  }

  static Stream<Object[]> reverseArrayData() {
    return Stream.of(
        new Object[] {new int[] {1, 2, 3, 4, 5, 6}, new int[] {6, 5, 4, 3, 2, 1}},
        new Object[] {new int[] {1, 2, 3, 4, 5, 6}, new int[] {6, 5, 4, 3, 2, 1}});
  }

  static Stream<Object[]> isPalindromeData() {
    return Stream.of(
        new Object[] {"ABCBA", true},
        new Object[] {"kaYak", true},
        new Object[] {"hello", false},
        new Object[] {"RaCEACAR", false},
        new Object[] {"A", true},
        new Object[] {"ABCDABCD", false});
  }

  static Stream<Object[]> sortColorsData() {
    return Stream.of(
        new Object[] {
          new int[] {1, 0, 2, 1, 2, 2},
          new int[] {0, 1, 1, 2, 2, 2}
        },
        new Object[] {
          new int[] {0, 1, 0},
          new int[] {0, 0, 1}
        },
        new Object[] {new int[] {1}, new int[] {1}},
        new Object[] {
          new int[] {2, 2},
          new int[] {2, 2}
        },
        new Object[] {
          new int[] {1, 1, 0, 2},
          new int[] {0, 1, 1, 2}
        },
        new Object[] {
          new int[] {2, 1, 1, 0, 0},
          new int[] {0, 0, 1, 1, 2}
        });
  }

  static Stream<Object[]> reverseWordsData() {
    return Stream.of(
        new Object[] {
          "The quick brown fox jumped over a lazy dog", "dog lazy a over jumped fox brown quick The"
        },
        new Object[] {"We love Java ", "Java love We"},
        new Object[] {"1234 abc XYZ", "XYZ abc 1234"},
        new Object[] {"You are amazing", "amazing are You"},
        //  new Object[] {"Hello     World", "World Hello"},
        new Object[] {"Greeting123", "Greeting123"});
  }
}
