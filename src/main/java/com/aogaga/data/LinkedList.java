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
package com.aogaga.data;

public class LinkedList<T> {
  public Node head;

  public LinkedList() {
    this.head = null;
  }

  public void insertNodeAtHead(Node node) {
    if (this.head == null) {
      this.head = node;
    } else {
      node.next = this.head;
      this.head = node;
    }
  }

  public void createLinkedList(int[] list) {
    for (int i = 0; i < list.length; i++) {
      Node node = new Node(list[i]);
      insertNodeAtHead(node);
    }
  }
}
