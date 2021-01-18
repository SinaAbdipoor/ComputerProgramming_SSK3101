package ssk3101_assignment17;

/**
 *
 * @author sinaa
 */
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        //Can access radius as it is #protected 
        return "ResizableCircle{" + "radius=" + radius + '}';
    }

    @Override
    public void resize(int percent) {
        radius = radius * (100 + percent) / 100;
    }
}
