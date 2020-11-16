package ssk3101_assignment3;

/**
 *
 * @author sinaa
 */
public class MyJavaCoffeeOutlet {

    //Price of 200 gram coffee bag in RM
    private final double COFFEE_BAG_PRICE = 5.50;
    //Number of bags in each box
    private final int LARGE_BOX_CAPACITY = 20;
    private final int MEDIUM_BOX_CAPACITY = 10;
    private final int SMALL_BOX_CAPACITY = 5;
    //Cost of each box in RM
    private final double LARGE_BOX_COST = 1.80;
    private final double MEDIUM_BOX_COST = 1.00;
    private final double SMALL_BOX_COST = 0.60;
    //Number of bags ordered
    private int quantity;

    //Constructor
    public MyJavaCoffeeOutlet(int quantity) {
        this.quantity = quantity;
    }

    //Calculating the cost of coffee bags
    private double getCost() {
        return quantity * COFFEE_BAG_PRICE;
    }

    //Calculating discount percent
    private int getDiscountPercent() {
        if (quantity >= 300) {
            return 30;
        }
        if (quantity >= 200) {
            return 25;
        }
        if (quantity >= 150) {
            return 20;
        }
        if (quantity >= 100) {
            return 15;
        }
        if (quantity >= 50) {
            return 10;
        }
        if (quantity >= 25) {
            return 5;
        }
        return 0;
    }

    //Calculating the discount based on the discount percent
    private double getDiscount() {
        double cost = getCost();
        int percent = getDiscountPercent();
        return (double) Math.round(cost * percent) / 100;
    }

    //Putting the coffee bags in boxes
    private int[] getBoxes() {
        //remaining bags
        int remainingBags = quantity;
        //box[0]: #large box, box[1]: #medium box, box[2]: #small box
        int[] box = new int[3];

        if (remainingBags >= LARGE_BOX_CAPACITY) {
            box[0] = remainingBags / LARGE_BOX_CAPACITY;
            remainingBags = remainingBags % LARGE_BOX_CAPACITY;
        }
        if (remainingBags >= MEDIUM_BOX_CAPACITY) {
            box[1] = remainingBags / MEDIUM_BOX_CAPACITY;
            remainingBags = remainingBags % MEDIUM_BOX_CAPACITY;
        }
        if (remainingBags >= SMALL_BOX_CAPACITY) {
            box[2] = remainingBags / SMALL_BOX_CAPACITY;
            remainingBags = remainingBags % SMALL_BOX_CAPACITY;
        }
        if (remainingBags > 0) {
            box[2]++;
        }
        return box;
    }

    //Calculates the cost for the boxes used
    private double[] getBoxesCosts() {
        int[] boxes = getBoxes();
        double[] boxesCosts = new double[3];
        boxesCosts[0] = boxes[0] * LARGE_BOX_COST;
        boxesCosts[1] = boxes[1] * MEDIUM_BOX_COST;
        boxesCosts[2] = boxes[2] * SMALL_BOX_COST;
        return boxesCosts;
    }

    public void printOrder() {
        int[] boxes = getBoxes();
        double[] boxesCosts = getBoxesCosts();
        System.out.println("Numbers of Bags Ordered: " + quantity + " - RM"
                + getCost() + "\n");
        System.out.println("Discount:\n\t" + getDiscountPercent() + "% - RM"
                + getDiscount() + "\n");
        System.out.println("Boxes Used:");
        if (boxes[0] > 0) {
            System.out.println("\t" + boxes[0] + " Large\t\t- RM"
                    + boxesCosts[0]);
        }
        if (boxes[1] > 0) {
            System.out.println("\t" + boxes[1] + " Medium\t\t- RM"
                    + boxesCosts[1]);
        }
        if (boxes[2] > 0) {
            System.out.println("\t" + boxes[2] + " Small\t\t- RM"
                    + boxesCosts[2]);
        }
    }
}
