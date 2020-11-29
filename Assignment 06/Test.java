package ssk3101_assignment6;

/**
 *
 * @author sinaa
 */
public class Test {

    public static void main(String[] args) {
        //Testing Academic
        Academic academic1 = new Academic("Sharifah Haleeda Amir", 46, "A9202");
        System.out.println("Academic:\n" + academic1);
        //Testing Supporter
        Supporter supporter1 = new Supporter("Deen Ramli", 30, "NA8292");
        System.out.println("\nSupporter:\n" + supporter1);
        //Testing postgraduate
        Postgraduate postgraduate1 = new Postgraduate("Jardien KWoo", "GS657",
                "Master", 12, "Stress Prediction");
        System.out.println("\nPostgraduate:\n" + postgraduate1);
        //Testing Undergraduate
        Undergraduate undergraduate1 = new Undergraduate("Amy Ong", 42527, 18,
                "Senior");
        System.out.println("\nUndergraduate:\n" + undergraduate1);
    }

}
