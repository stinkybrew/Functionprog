/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author Simo
 */
public class AbstractShapeFactory {
    
    Map<String, Supplier<Shape>> map; 
   
    public AbstractShapeFactory(){
        map = new HashMap<>();
    }   
        
    public Shape getShape(String shapeType){
     Supplier<Shape> shape = map.get(shapeType.toUpperCase());
     if(shape != null) {
       return shape.get();
     }
     throw new IllegalArgumentException("No such shape " + shapeType.toUpperCase());
  }
}
