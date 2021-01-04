package ssk3101_assignment14;

/**
 *
 * @author sinaa
 */
class Student {

    private final String MATRIC_NO;
    private final double test1, test2, as1, as2, as3, finalExam;

    Student(String MATRIC_NO, double test1, double test2, double as1,
            double as2, double as3, double finalExam) throws
            IllegalArgumentException {
        this.MATRIC_NO = MATRIC_NO;
        if (test1 < 0 || test1 > 50 || test2 < 0 || test2 > 50) {
            throw new IllegalArgumentException("Test results must be between 0 "
                    + "and 50");
        }
        this.test1 = test1;
        this.test2 = test2;
        if (as1 < 0 || as1 > 30 || as2 < 0 || as2 > 30 || as3 < 0 || as3 > 30) {
            throw new IllegalArgumentException("Assignment marks must be "
                    + "between 0 and 30");
        }
        this.as1 = as1;
        this.as2 = as2;
        this.as3 = as3;
        if (finalExam < 0 || finalExam > 100) {
            throw new IllegalArgumentException("Final mark must be between 0 "
                    + "and 100");
        }
        this.finalExam = finalExam;
    }

    String getMATRIC_NO() {
        return MATRIC_NO;
    }

    double calcTest1Percent() {
        return test1 * 20 / 50;
    }

    double calcTest2Percent() {
        return test2 * 20 / 50;
    }

    double calcAs1Percent() {
        return as1 * 10 / 30;
    }

    double calcAs2Percent() {
        return as2 * 10 / 30;
    }

    double calcAs3Percent() {
        return as3 * 10 / 30;
    }

    double calcFinalExamPercent() {
        return finalExam * 30 / 100;
    }

    double calcTotalAssignmentsPercent() {
        return (as1 + as2 + as3) / 3;
    }

    double calcTotal() {
        return calcTest1Percent() + calcTest2Percent() + calcAs1Percent()
                + calcAs2Percent() + calcAs3Percent() + calcFinalExamPercent();
    }

    String calcGrade() {
        double total = calcTotal();
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

    @Override
    public String toString() {
        return "Student: " + MATRIC_NO
                + "\nTest1: " + test1 + "(" + calcTest1Percent() + "%)"
                + "\nTest2: " + test2 + "(" + calcTest2Percent() + "%)"
                + "\nAs1: " + as1 + "(" + calcAs1Percent() + "%)"
                + "\nAs2: " + as2 + "(" + calcAs2Percent() + "%)"
                + "\nAs3: " + as3 + "(" + calcAs3Percent() + "%)"
                + "\nFinal: " + finalExam + "(" + calcFinalExamPercent() + "%)"
                + "\nTotal: " + calcTotal() + "%\nGrade: " + calcGrade();
    }
}
