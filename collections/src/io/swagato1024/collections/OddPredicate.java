package io.swagato1024.collections;

import java.util.function.Predicate;

public class OddPredicate implements Predicate<Integer> {
  @Override
  public boolean test(Integer n) {
    return n % 2 != 0;
  }

  @Override
  public Predicate<Integer> and(Predicate<? super Integer> other) {
    return Predicate.super.and(other);
  }
}
