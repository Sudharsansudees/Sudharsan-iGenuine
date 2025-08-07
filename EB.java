import java.util.*;

public class EB {

    public void Bill(int unit, String type) {
        int totalPrice = 0;

        if (type.equals("domestic")) {
            if (unit <= 100) {
                System.out.println("Total EB Bill: ₹0 (First 100 units are free)");
                return;
            }

            if (unit > 100) {
                totalPrice += Math.min(unit, 200) - 100 * 5;
            }
            if (unit > 200) {
                totalPrice += Math.min(unit, 300) - 200 * 10;
            }
            if (unit > 300) {
                totalPrice += Math.min(unit, 400) - 300 * 15;
            }
            if (unit > 400) {
                totalPrice += Math.min(unit, 500) - 400 * 25;
            }
            if (unit > 500) {
                totalPrice += (unit - 500) * 25;
            }
        }

        else if (type.equals("commercial")) {
            if (unit > 0) {
                totalPrice += Math.min(unit, 100) * 10;
            }
            if (unit > 100) {
                totalPrice += (Math.min(unit, 200) - 100) * 20;
            }
            if (unit > 200) {
                totalPrice += (Math.min(unit, 300) - 200) * 30;
            }
            if (unit > 300) {
                totalPrice += (Math.min(unit, 400) - 300) * 40;
            }
            if (unit > 400) {
                totalPrice += (Math.min(unit, 500) - 400) * 50;
            }
            if (unit > 500) {
                totalPrice += (unit - 500) * 100;
            }
        }

        else {
            System.out.println("Invalid ");
            return;
        }

        System.out.println("Total EB Bill: " + totalPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EB obj = new EB();

        System.out.print("Enter The Unit: ");
        int unit = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Type (domestic/commercial): ");
        String type = sc.nextLine().toLowerCase();

        obj.Bill(unit, type);
    }
}
