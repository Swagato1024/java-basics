package io.swagato1024.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Algoritm {
  public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
    List<T> result = new ArrayList<T>();

    for (T ele : list) {
      if(predicate.test(ele)) {
        result.add(ele);
      }
    }

    return (List<T>) result;
  }

  public static Map<Character, Integer> countFrequency(String paragraph) {
    Map<Character, Integer> frequencies = new HashMap<>();

    for(Character c: paragraph.toCharArray()) {
      Integer count = frequencies.getOrDefault(c, 0);
      frequencies.put(c, count + 1);
    }

    return frequencies;
  }
}
