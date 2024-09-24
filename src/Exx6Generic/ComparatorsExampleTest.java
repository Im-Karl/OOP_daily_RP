package Exx6Generic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

class ComparatorsEx {
    public static <T> T max(Collection<? extends T> coll, Comparator<? super T> cmp) {
        T candidate = coll.iterator().next();
        for (T elt : coll) {
            if (cmp.compare(candidate, elt) < 0) {
                candidate = elt;
            }
        }
        return candidate;
    }

    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
        return max(coll, naturalOrder());
    }

    public static <T> T min(Collection<? extends T> coll, Comparator<? super T> cmp) {
        return max(coll, reverseOrder(cmp));
    }

    public static <T extends Comparable<? super T>> T min(Collection<? extends T> coll) {
        return max(coll, reverseOrder());
    }

    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        return Comparator.naturalOrder();
    }

    public static <T> Comparator<T> reverseOrder(final Comparator<T> cmp) {
        return (o1, o2) -> cmp.compare(o2, o1);
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        return Comparator.reverseOrder();
    }
}

public class ComparatorsExampleTest {
    public static void main(String[] args) {
        Comparator<String> sizeOrder = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() != s2.length() ? Integer.compare(s1.length(), s2.length()) : s1.compareTo(s2);
            }
        };

        Collection<String> strings = Arrays.asList("AAA", "aaa", "CCC", "f");

        System.out.println(ComparatorsEx.max(strings)); // Natural max
        System.out.println(ComparatorsEx.min(strings)); // Natural min
        System.out.println(ComparatorsEx.max(strings, sizeOrder)); // Max by size
        System.out.println(ComparatorsEx.min(strings, sizeOrder)); // Min by size
    }
}
