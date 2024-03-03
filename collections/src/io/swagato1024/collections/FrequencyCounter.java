package io.swagato1024.collections;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
  public static Map<Character, Integer> countFrequency(String paragraph) {
    Map<Character, Integer> frequencies = new HashMap<>();

    for(Character c: paragraph.toCharArray()) {
      Integer count = frequencies.getOrDefault(c, 0);
      frequencies.put(c, count + 1);
    }

    return frequencies;
  }

  public static Map<Character, Double> countFrequencyPercentage(String paragraph) {
    Map<Character, Integer> frequencies = FrequencyCounter.countFrequency(paragraph);
    Map<Character, Double> frequenciesInPercent = new HashMap<>();

    for(Character key: frequencies.keySet()) {
      Double frequency = (double) frequencies.get(key);
      Double frequencyInPercentage =  (frequency / paragraph.length() * 100);
      frequenciesInPercent.put(key, frequencyInPercentage);
    }

    return frequenciesInPercent;
  }

}
