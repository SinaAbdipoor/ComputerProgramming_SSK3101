package ssk3101_assignment13;

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
     * @param args the command line arguments -> path to the input file
     */
    //The big question of this week: Should we handle every exception?
    //Why dirty code is disgusting?
    public static void main(String[] args) throws FileNotFoundException,
            IOException {
        //File inputFile = new File(args[0]);    Getting the path from command
        //Loading the patientData file (this might throw FileNotFoundException)
        File inputFile = new File("patientData.txt");
        FileWriter fileWriter = new FileWriter("output.txt");
        //Rading the file and getting the info
        Scanner fileReader = new Scanner(inputFile);
        while (fileReader.hasNextLine()) {
            String[] patientData = fileReader.nextLine().split("\t");
            try {
                String name = patientData[0] + patientData[1];
                char gender = patientData[2].charAt(0);
                double waistSize = Double.parseDouble(patientData[3]);
                //Creating object from HealthRisk class to calculate the risk
                HealthRisk patient = new HealthRisk(name, gender, waistSize);
                //Write to the output file
                fileWriter.write(patient.toString() + "\n");
            } catch (NumberFormatException nfe) {
                System.err.println("Waist size must be a double");
                nfe.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException ie) {
                System.err.println("Incorrect input file format");
                ie.printStackTrace();
            } catch (IllegalArgumentException iae) {
                iae.printStackTrace();
            }
        }
        System.out.println("Health risk was calculated successfully. Please "
                + "check the output file.");
        fileReader.close();
        fileWriter.close();
    }
}
