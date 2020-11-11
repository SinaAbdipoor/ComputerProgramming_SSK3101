package ssk3101_assignment2;

/**
 *
 * @author sinaa
 */
public class Student {

    //2 test results contribute 40% to the total mark
    private double test1, test2;
    //3 assignments contributing 30% to the total mark
    private double as1, as2, as3;
    //And the remaining 40% will be taken by final examination
    private double finalExam;

    public Student(double test1, double test2, double as1, double as2,
            double as3, double finalExam) {
        this.test1 = test1;
        this.test2 = test2;
        this.as1 = as1;
        this.as2 = as2;
        this.as3 = as3;
        this.finalExam = finalExam;
    }

    private double getSubTotal() {
        //Calculating sub total by adding assignment scores
        return as1 + as2 + as3;
    }

    private double getTotal() {
        //Calculating total based on test results and sub total and final
        return (((test1 + test2) * 0.4) + (getSubTotal() / 3)
                + (finalExam * 0.3));
    }

    private String getGrade() {
        double total = getTotal();
        //Calculating grade based on total
        if (total >= 80) {
            return "A";
        }
        if (total >= 75) {
            return "A-";
        }
        if (total >= 70) {
            return "B+";
        }
        if (total >= 65) {
            return "B";
        }
        if (total >= 60) {
            return "B-";
        }
        if (total >= 55) {
            return "C+";
        }
        if (total >= 50) {
            return "C";
        }
        if (total >= 47) {
            return "C-";
        }
        if (total >= 44) {
            return "D+";
        }
        if (total >= 40) {
            return "D";
        }
        return "F";
    }

    public String toString() {
        //TODO
        return "\t\t\t\t\tCALCULATED MARKS\n\nTEST1\tTEST2\tAS1\tAS2\tAS3\t"
                + "SUB_TOTAL\tFINAL_EXAM\tTOTAL\tGRADE\n_______________________"
                + "____________________________________________________________"
                + "_____\n" + (double) Math.round(test1 * 100) / 100 + "\t"
                + (double) Math.round(test2 * 100) / 100 + "\t"
                + (double) Math.round(as1 * 100) / 100 + "\t"
                + (double) Math.round(as2 * 100) / 100 + "\t"
                + (double) Math.round(as3 * 100) / 100 + "\t   "
                + (double) Math.round(getSubTotal() * 100) / 100 + "\t\t   "
                + (double) Math.round(finalExam * 100) / 100 + "\t\t "
                + (double) Math.round(getTotal() * 100) / 100 + "%\t  "
                + getGrade();
    }
}
