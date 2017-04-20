import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.*;
import java.util.stream.Collector;
import static java.util.stream.Collector.Characteristics.*;

/**
*
* @author Simo
* @param
*/
public class OmaListaKollektori<T> implements Collector<T, List<T>, List<T>> {
/*    
    @Override
    public Supplier<List<T>> supplier() {
        return new Supplier<List<T>>(){
            @Override
            public List<T> get(){
                return new ArrayList<>();
            }
        };
    }

*/
    @Override
    public Supplier<List<T>> supplier() {     // () -> T
        return () -> new CopyOnWriteArrayList<>();
    }


    @Override
    public BiConsumer<List<T>, T> accumulator() {  // T, U -> void
        return (list, item) -> list.add(item);
    }

    @Override
    public BinaryOperator<List<T>> combiner() {   // T, T -> T
        return (list1, list2) -> {
            //System.out.println("c: ");
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        //return list -> list;  
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH, CONCURRENT));
    }
}


