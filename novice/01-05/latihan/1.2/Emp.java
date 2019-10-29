// Java code for serialization and deserialization  
// of a Java object 
import java.io.*; 
  
public class Emp implements Serializable { 
private static final long serialversionUID = 
                                 129348938L; 
    public transient int a; 
    public static int b; 
    public String name; 
    public int age; 
  
    // Default constructor 
public Emp(String name, int age, int a, int b) 
    { 
        this.name = name; 
        this.age = age; 
        this.a = a; 
        this.b = b; 
    } 
  
} 
