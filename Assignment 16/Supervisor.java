/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssk3101_assignment16;

/**
 *
 * @author sinaa
 */
public class Supervisor extends GeneralWorker {

    public Supervisor() {
    }

    public Supervisor(String name, double hour, double payrate) {
        super(name, hour, payrate);
    }

    public double bonus() {
        return super.grossIncome() * 0.1;
    }

    @Override
    public double netPay() {
        return super.netPay() + bonus();
    }

    @Override
    public String toString() {
        return "Supervisor{" + "Name=" + super.getName() + ", NetPay="
                + netPay() + '}';
    }
}
