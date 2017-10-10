import java.util.List;
import java.util.ArrayList;

class Functional3{
    
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
        
        omenat.sort((eka, toka) -> eka.getPaino()-toka.getPaino());
        // Sort ottaa vastaan Comparator-rajapinnan toteuttajan

        omenat.forEach((omena)->System.out.println(omena));
        
        omenat.sort((eka, toka) -> eka.getVari().compareTo(toka.getVari()));
        
        omenat.forEach((omena)->System.out.println(omena));
        
        
    }     
}


