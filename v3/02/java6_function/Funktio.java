import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.List;
import java.util.ArrayList;

/* Tämä näkyviin ihan vaan helpottamaan koodin ymmärtämistä:

    @functionalInterface
    public interface Function<T, R>{
        R apply(T t);
    }
    @functionalInterface
    public interface ToIntFunction<T>{
        int applyAsInt(T t);
    }
*/

class Funktio{
    
    public static <T, R> List<R> mappaa(List<T> lista, Function<T, R> f){
        List<R> tulokset = new ArrayList<>();
        for(T t: lista){
            tulokset.add(f.apply(t));
        }
        return tulokset;
    }

    public static <T> int redusoi(List<T> lista, ToIntFunction<T> f){
        int tulos = 0;
        for(T t: lista){
            tulos += f.applyAsInt(t);
        }
        return tulos;
    }

    public static void main(String[] args){
        
        List<String> nimet = new ArrayList<String>(){{add("Martti"); add("Sauli"); add("Mauno"); add("Pirkko");}};

        List<Integer> pituudet = mappaa(nimet, (String s) -> s.length());
        pituudet.forEach(p -> System.out.println(p));       
    
        int pituus = redusoi(nimet, (String s) -> s.length());
        System.out.println(pituus);
        
        // Yhdistetyt funktiot:
        
        // andThen:
        
        Function<String, String> alkukirjaimet = (String s) -> s.substring(0,2);    
        Function<String, Boolean> lopussaA = (String s) -> s.endsWith("a");    
        Function<String, Boolean> yhdistetty = alkukirjaimet.andThen(lopussaA);
        List<Boolean> tulostaulu = mappaa(nimet, yhdistetty);
        tulostaulu.forEach(b -> System.out.println(b));       
        
        // compose: (sama tulos)
        
        Function<String, Boolean> yhdistetty2 = lopussaA.compose(alkukirjaimet);
        List<Boolean> tulostaulu2 = mappaa(nimet, yhdistetty2);
        tulostaulu2.forEach(b -> System.out.println(b));       
        
    }
}
        