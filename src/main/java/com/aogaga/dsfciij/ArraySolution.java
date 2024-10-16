package com.aogaga.dsfciij;

import java.util.ArrayList;
import java.util.List;

public class ArraySolution {


  public int[] removeEven(int[] arr) {

    if (arr == null || arr.length == 0) {
      throw new IllegalArgumentException();
    }

    List<Integer> list = new ArrayList<Integer>();

    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 2 != 0){
        list.add(arr[i]);
      }
    }

    int[] result = new int[list.size()];
    for(int i = 0; i < list.size(); i++){
      result[i] = list.get(i);
    }
    return result;
  }

  public ArrayList<Integer> mergeArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {

  }


  }
