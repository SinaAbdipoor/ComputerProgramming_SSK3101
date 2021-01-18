package ssk3101_assignment15;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sinaa
 */
public class TestEmployee {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Random rdm = new Random();
        //Adding hourly employess
        employees.add(new HourlyEmployee("Wang", "Jin", 1, rdm.nextInt(20), rdm.nextInt(150)));
        employees.add(new HourlyEmployee("Jing", "Lee", 2, rdm.nextInt(20), rdm.nextInt(150)));
        employees.add(new HourlyEmployee("Quan", "Min", 3, rdm.nextInt(20), rdm.nextInt(150)));
        employees.add(new HourlyEmployee("Chow", "Lee", 4, rdm.nextInt(20), rdm.nextInt(150)));
        employees.add(new HourlyEmployee("An", "Hai", 5, rdm.nextInt(20), rdm.nextInt(150)));
        employees.add(new HourlyEmployee("Bao", "Hao", 6, rdm.nextInt(20), rdm.nextInt(150)));
        employees.add(new HourlyEmployee("Chen", "He", 7, rdm.nextInt(20), rdm.nextInt(150)));
        employees.add(new HourlyEmployee("Chow", "Hoh", 8, rdm.nextInt(20), rdm.nextInt(150)));
        employees.add(new HourlyEmployee("Chyou", "Jiang", 9, rdm.nextInt(20), rdm.nextInt(150)));
        employees.add(new HourlyEmployee("Guanyin", "Joe", 10, rdm.nextInt(20), rdm.nextInt(150)));
        //Adding salaried employees
        employees.add(new SalariedEmployee("Sun", "Ruan", 11, rdm.nextInt(50)));
        employees.add(new SalariedEmployee("Quan", "Soo", 12, rdm.nextInt(50)));
        employees.add(new SalariedEmployee("Wang", "Su", 13, rdm.nextInt(50)));
        employees.add(new SalariedEmployee("Xin", "Tang", 14, rdm.nextInt(50)));
        employees.add(new SalariedEmployee("Ushi", "To", 15, rdm.nextInt(50)));
        employees.add(new SalariedEmployee("Zhengqiu", "Luo", 16, rdm.nextInt(50)));
        employees.add(new SalariedEmployee("Mei", "Mah", 17, rdm.nextInt(50)));
        employees.add(new SalariedEmployee("Wen", "Meng", 18, rdm.nextInt(50)));
        employees.add(new SalariedEmployee("Xing-fu", "Pei", 19, rdm.nextInt(50)));
        employees.add(new SalariedEmployee("Yu", "Owyang", 20, rdm.nextInt(50)));
        //Invoking the toStrings
        for (Employee e : employees) {
            System.out.println(e + "\nSalary: " + e.earnings());
        }
    }
}
