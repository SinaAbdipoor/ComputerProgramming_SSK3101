package ssk3101_assignment14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sinaa
 */
class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,
            IOException {
        System.out.println("Loading the input marks file...");
        Scanner fileReader = new Scanner(new File(args[0]));
        File output = new File("Documents/output.txt");
        FileWriter fileWriter = new FileWriter(output);
        String line;
        String data[];
        try {
            System.out.println(fileReader.nextLine());
            fileWriter.write("Matric No.\tTest1(20%)\tTest2(20%)\t"
                    + "Assignments(30%)\tFinal(30%)\tTotal(100%)\tGrade\n");
            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                System.out.println(line);
                data = line.split("\t");
                Student student = new Student(data[0],
                        Double.parseDouble(data[1]), Double.parseDouble(data[2]),
                        Double.parseDouble(data[3]), Double.parseDouble(data[4]),
                        Double.parseDouble(data[5]), Double.parseDouble(data[6]));
                System.out.println("Calculating marks...");
                System.out.println(student);
                System.out.println("Writing the results on the output file...\n");
                fileWriter.write(student.getMATRIC_NO() + "\t\t"
                        + round(student.calcTest1Percent()) + "\t\t"
                        + round(student.calcTest2Percent()) + "\t\t"
                        + round(student.calcTotalAssignmentsPercent()) + "\t\t\t"
                        + round(student.calcFinalExamPercent()) + "\t\t"
                        + round(student.calcTotal()) + "\t\t"
                        + student.calcGrade() + "\n");
            }
            System.out.println("Results have been calculated and printed "
                    + "successfully. You can find the output file here: "
                    + output.getAbsolutePath());
            fileReader.close();
            fileWriter.close();
        } catch (IllegalArgumentException iae) {
            System.err.println(iae);
        } catch (ArrayIndexOutOfBoundsException iobe) {
            System.err.println("Incorrect input file format: " + iobe);
        }
    }

    private static double round(double input) {
        return (double) Math.round(input * 100) / 100;
    }
}
