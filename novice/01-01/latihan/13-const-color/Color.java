public class Color implements java.io.Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int value;
    private transient String name;
    
    public static final Color RED   = new Color( 0, "Red"   );
    public static final Color BLUE  = new Color( 1, "Blue"  );
    public static final Color GREEN = new Color( 2, "Green" );
    private Color( int value, String name )
    {
        this.value = value;
        this.name = name;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String toString()
    {
        return name;
    }

    public Color fixColor;

    public void setColor(Color x)
    {
        fixColor = x;
    }

    public void someMethod()
    {
        setColor(Color.RED);
    }

    public static void main (String[] args)
    {
        
        System.out.println(x);
    }
}