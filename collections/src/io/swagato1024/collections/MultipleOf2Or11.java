package io.swagato1024.collections;

import java.util.function.Predicate;

public class MultipleOf2Or11 implements Predicate<Integer> {

  @Override
  public boolean test(Integer n) {
    return (n % 2 == 0) || (n % 11 == 0) ;
  }

  @Override
  public Predicate<Integer> or(Predicate<? super Integer> other) {
    return Predicate.super.or(other);
  }
}
