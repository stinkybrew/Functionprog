class Functional2{
    
    // Hyödynnetään itse määriteltyä GeneratorFIF-rajapintaa
    // ja Tulostaja-luokkaa


    public static void main(String[] args){
    
        // GeneratorFIF:n toteutuksia:
    
        GeneratorFIF generatorOldWay = new GeneratorFIF(){
            public int get(){
                return 3;
            }
        };
        
        // Koska kyseessä funktionaalinen rajapinta, voidaan hyödyntää lambda-lausekkeita:
        
        GeneratorFIF generaattori1 = () -> 2;  
        GeneratorFIF generaattori2 = () -> (int)(Math.random() * 6 + 1);  
        
        
        Tulostaja t = new Tulostaja();
        
        t.tulosta(generatorOldWay);
        t.tulosta(generaattori1);
        t.tulosta(generaattori2);
        t.tulosta(()->100);
    }   
    
}


