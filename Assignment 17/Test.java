package ssk3101_assignment17;

/**
 *
 * @author sinaa
 */
public class Test {

    public static void main(String[] args) {
        ResizableCircle c1 = new ResizableCircle(3);
        System.out.println(c1);
        System.out.println("Perimeter=" + c1.getPerimeter());
        System.out.println("Area=" + c1.getArea());
        System.out.println("After increasing radius by 50%:");
        c1.resize(50);
        System.out.println(c1);
        System.out.println("Perimeter=" + c1.getPerimeter());
        System.out.println("Area=" + c1.getArea());
    }
}
