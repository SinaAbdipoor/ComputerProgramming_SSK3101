package ssk3101_assignment16;

/**
 *
 * @author sinaa
 */
public class GeneralWorker {

    private String name;
    private double hour;    //Hours worked
    private double payrate; //Per hour
    //Should we throw an exception when hour or payrate < 0?
    //What happens if we don't?

    public GeneralWorker() {

    }

    public GeneralWorker(String name, double hour, double payrate) {
        this.name = name;
        this.hour = hour;
        this.payrate = payrate;
    }

    public String getName() {
        return name;
    }

    //As the next 3 methods are dependant, what will happen if they are overriden?
    public double grossIncome() {
        return hour * payrate;
    }

    public double deduction() {
        return grossIncome() * 0.11;
    }

    public double netPay() {
        return grossIncome() - deduction();
    }
}
