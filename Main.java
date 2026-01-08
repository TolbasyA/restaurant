import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Staff> staffList = new ArrayList<>();

        staffList.add(new Staff("Bob", 40, 2000, "Staff"));
        staffList.add(new Chef("Anna", 30, 2500, "Italian"));
        staffList.add(new Waiter("Tom", 22, 1800, 5));

        for (Staff s : staffList) {
            s.work();                 // polymorphism
            System.out.println(s.calculatePay());
        }

        System.out.println("\nOnly Chefs:");
        for (Staff s : staffList) {
            if (s instanceof Chef) {
                ((Chef) s).cookSpecial();   // downcasting
            }
        }
    }
}