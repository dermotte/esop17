package at.aau.itec.esop17.lesson11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetFun {
    public static void main(String[] args) {
      Set s1 = new HashSet();
      Set s2 = new HashSet();
      s1.add(1);
      s1.add(2);
      s1.add(3);
      s2.add(2);
      s2.add(3);
      Set s3 = unionSet(s1, s2);
      // printSet(s3);
      s3 = intersect(s1, s2);
      printSet(s3);
    }

    public static Set unionSet(Set a, Set b) {
        Set result = new HashSet();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    public static Set intersect(Set a, Set b) {
        Set result = new HashSet();
        result.addAll(a);
        Set aOhneB = new HashSet();
        aOhneB.addAll(a);
        aOhneB.removeAll(b);
        result.removeAll(aOhneB);
        return result;
    }

    public static void printSet(Set s) {
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
