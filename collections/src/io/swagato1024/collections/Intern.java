package io.swagato1024.collections;

public class Intern {
  private final String name;
  private final Integer id;

  Intern(String name, Integer id) {
    this.name = name;
    this.id = id;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null || getClass() != obj.getClass()) return false;

    Intern intern = (Intern) obj;
    return this.id == intern.id && this.name == intern.name;
  }

  @Override
  public int hashCode() {
    return name.hashCode() + this.id;
  }

  @Override
  public String toString() {
    return "Intern{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
  }
}
