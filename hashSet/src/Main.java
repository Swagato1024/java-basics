import IdComparator.IdComparator;

import java.util.*;

public class Main {

  public static void iterate(Set<Intern> interns) {
    Iterator<Intern> itr = interns.iterator();
    System.out.println(itr.next());
  }

  public static  List<Intern> createInterns(Intern... interns) {
    
  }


  public static void main(String[] args) {
    Set<Intern> interns = new HashSet<>();
    Intern utsab = new Intern("utsab", 1);
    Intern bittu = new Intern("bittu", 2);
    Intern bittu1 = bittu;


    interns.add(utsab);
    interns.add(bittu);
    interns.add(bittu1);

    iterate(interns);

    List<Intern> singers = new ArrayList<Intern>(interns);
    IdComparator idComparator = new IdComparator();
    singers.sort(idComparator);
  }
}
