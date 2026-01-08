public class Staff {
    protected String name;
    protected int age;
    protected double salary;
    protected String role;

    public Staff(String name, int age, double salary, String role) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.role = role;
    }

    public void work() {
        System.out.println("Staff is working");
    }

    public void getInfo() {
        System.out.println(name + ", " + role);
    }

    public double calculatePay() {
        return salary;
    }
}
