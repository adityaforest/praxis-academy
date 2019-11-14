package design_pattern_AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){   
       if(rounded){
          return new RoundedShapeFactory();         
       }else{
          return new ShapeFactory();
       }
    }
 }
 