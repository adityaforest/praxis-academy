package TestingTest;

public class MyClass {
    public String getGreeting() {
        return "Hello world.";
    }

    public int multiply(int x, int y)
    {
        return (x*y);
    }
    public static void main(String[] args) {
        System.out.println(new MyClass().getGreeting());
    }
}
