package ObjectWithPureFunction;
class App
{
    public int sum(int a, int b) {
        return a + b;
    }

    public static void main (String[] args)
    {
        App a = new App();
        System.out.println(a.sum(1,2));        
    }
}
