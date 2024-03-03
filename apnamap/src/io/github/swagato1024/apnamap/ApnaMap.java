package io.github.swagato1024.apnamap;

import java.util.*;

public class ApnaMap<K, V> {
  private Set<Pair<K, V>> entries;
  private int modCount;

  public ApnaMap() {
    this.entries = new HashSet<>();
    this.modCount = 0;
  }

  public class EntriesIterator implements Iterator {
    private final int mc;
    private final Iterator<Pair<K, V>> entriesIterator;

    public EntriesIterator(int mc) {
      this.entriesIterator = entries.iterator();
      this.mc = mc;
    }

    @Override
    public boolean hasNext() {
      return entriesIterator.hasNext();
    }

    @Override
    public Pair<K, V> next() {
      return entriesIterator.next();
    }
  }

  public class Entries<P> implements Iterable {
    @Override
    public Iterator iterator() {
      return new EntriesIterator(modCount);
    }
  }

  public static class Pair<K, V> {
    private K key;
    private V val;

    public Pair(K key, V value) {
      this.key = key;
      this.val = value;
    }

    @Override
    public String toString() {
      return "Entry{" +
              "key=" + key +
              ", val=" + val +
              '}';
    }
  }

  public void insert(K k, V v) {
    Pair<K, V> pair = new Pair<>(k, v);
    entries.add(pair);
    modCount += 1;
  }

  public Entries<Pair<K, V>> entries() {
    return new Entries<Pair<K, V>> ();
  }
}
