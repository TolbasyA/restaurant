public class Chef extends Staff {
    private String cuisine;

    public Chef(String name, int age, double salary, String cuisine) {
        super(name, age, salary, "Chef");
        this.cuisine = cuisine;
    }

    @Override
    public void work() {
        System.out.println(name + " is cooking " + cuisine + " food");
    }

    @Override
    public double calculatePay() {
        return salary + 200;
    }

    public void cookSpecial() {
        System.out.println("Chef cooks a special dish");
    }

    public void cleanKitchen() {
        System.out.println("Chef cleans the kitchen");
    }
}
