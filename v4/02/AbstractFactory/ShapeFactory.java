/**
 *
 * @author Simo
 */
public class ShapeFactory extends AbstractShapeFactory{
    
    public ShapeFactory() {
        map.put("CIRCLE", Circle::new);
        map.put("RECTANGLE", Rectangle::new);
    }   
  }
