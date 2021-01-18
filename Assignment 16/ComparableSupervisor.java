package ssk3101_assignment16;

/**
 *
 * @author sinaa
 */
public class ComparableSupervisor extends Supervisor implements
        Comparable<ComparableSupervisor> {

    public ComparableSupervisor(String name, double hour, double payrate) {
        super(name, hour, payrate);
    }

    @Override
    public int compareTo(ComparableSupervisor o) {
        return Integer.compare((int) this.netPay(), (int) o.netPay());
    }
}
