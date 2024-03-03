package io.swagato1024.collections;

import java.util.*;

public class Main {
  public static Set<Intern> generateInterns() {
    List <Integer> ll = new LinkedList<>();
    ll.add(34);
    ll.add(33);
    ll.add(100);

    List<Integer> numbers = new ArrayList<>(ll);
    numbers.add(50);
    numbers.add(9);

    OddPredicate oddPredicate = new OddPredicate();

    List<Integer> oddNumbers = Algoritm.filter(numbers, oddPredicate);

    Set<Intern> interns = new HashSet<>();
    Intern utsab = new Intern("utsab", 1);
    Intern bittu = new Intern("bittu", 2);
    Intern bittu1 = bittu;

    interns.add(utsab);
    interns.add(bittu);
    interns.add(bittu1);

    return interns;
  }

  public static void main(String[] args) {
    Map<Character, Integer> frequencies = FrequencyCounter.countFrequency("abcdabc");
    Map<Character, Double> frequenciesInPercent = FrequencyCounter.countFrequencyPercentage("abbaa");

    System.out.println(frequenciesInPercent);
  }
}
