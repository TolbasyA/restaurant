public class Waiter extends Staff {
    private int tables;

    public Waiter(String name, int age, double salary, int tables) {
        super(name, age, salary, "Waiter");
        this.tables = tables;
    }

    @Override
    public void work() {
        System.out.println(name + " serves " + tables + " tables");
    }

    @Override
    public double calculatePay() {
        return salary + tables * 10;
    }

    public void takeOrder() {
        System.out.println("Waiter takes an order");
    }

    public void serveFood() {
        System.out.println("Waiter serves food");
    }
}
