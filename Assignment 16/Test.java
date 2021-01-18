package ssk3101_assignment16;

/**
 *
 * @author sinaa Find all the issues in this projects, especially the design
 * flaws. Report them to me and gain extra 2 points.
 */
public class Test {

    public static void main(String[] args) {
        // :D
        ComparableSupervisor s1 = new ComparableSupervisor("Sina", 40, 25);
        ComparableSupervisor s2 = new ComparableSupervisor("Razali", 9, 125);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.compareTo(s2));
    }
}
