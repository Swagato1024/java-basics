package io.github.swagato1024;

import io.github.swagato1024.apnamap.ApnaMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    ApnaMap <Integer, String> map = new ApnaMap<>();
    map.insert(2, "bittu");
    map.insert(3, "raj");
    map.insert(5, "utsab");

    Iterable<ApnaMap.Pair<Integer, String>> entries = map.entries();

    for(ApnaMap.Pair<Integer, String> p : entries) {
      System.out.println(p);
    }
  }
}
