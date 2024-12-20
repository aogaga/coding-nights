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
package com.aogaga.structures;


import java.util.*;

public class DataStructures {
  public void arrayListPlayground() {
    List<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(10);

    Iterator<Integer> itr = list.iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    Iterator<Integer> newIterator = list.iterator();
    newIterator.forEachRemaining(element -> System.out.println(element));
  }

  public void linkedListPlayGround() {
    List<Integer> list = new LinkedList<Integer>();
  }

  public void hashSetPlayGround() {
    Set<Integer> set = new HashSet<Integer>();
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(20);

    System.out.println(set);
  }
}
