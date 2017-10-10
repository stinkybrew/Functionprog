import java.util.List;
import java.util.ArrayList;
import java.util.function.Supplier;
import static java.util.stream.Collectors.*;
import java.util.stream.DoubleStream;


class Kollektori{
    
    public static void main(String[] args){
    
        Omena o1 = new Omena("vihreä", 100);
        Omena o2 = new Omena("vihreä", 110);
        Omena o3 = new Omena("punainen", 101);
        Omena o4 = new Omena("punainen", 105);
        
        List<Omena> omenat = new ArrayList<>();
        
        omenat.add(o1);
        omenat.add(o2);
        omenat.add(o3);
        omenat.add(o4);
            
  /*      
        List<Omena> punaiset = 
                omenat.stream()
                    .filter(o -> "punainen".equals(o.getVari()))
                    .collect(toList()); 
                
        punaiset.forEach(o -> System.out.println(o));
        // punaiset.forEach(System.out::println)


        List<Omena> vihreat = 
                omenat.stream()
                    .filter(o -> "vihreä".equals(o.getVari()))
                    .collect(new OmaListaKollektori<>()); 
                
        vihreat.forEach(o -> System.out.println(o));
*/      
  
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Cores: " + cores);
       
        long start = System.nanoTime();
       
        List<Double> l = DoubleStream.generate(Math::random)
        .parallel()
        .limit(50000)
        .boxed()
        .collect(new OmaListaKollektori<>());  // ikioma kollektori
        //.collect(toList()); // Javan oma
       
        long duration = System.nanoTime() - start;
       
        System.out.println(l.size() + " " + duration / 1000000);
      
    }     
    
}

