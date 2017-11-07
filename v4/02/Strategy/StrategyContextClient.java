//package strategy;

/**
 *
 * @author Simo
 */
public class StrategyContextClient{
    
    public static void main(String[] args){
        
        StrategyContext konteksti = new StrategyContext((String s) -> s.toUpperCase());
        
        
        // Käytetään valmiiksi injektoitua strategiaa:
        konteksti.setData("Matias");
        konteksti.modifyData();
        System.out.println(konteksti.getData());
        
        
        // Injektoidaan strategia kutsun yhteydessä:
        konteksti.modifyDataWithStrategy((String s)-> { 
            if (s.startsWith("J")){
               s = s.toLowerCase();
            }
            else{
               s = s.replace("A", "E");
            }
            return s;
        });
        System.out.println(konteksti.getData());
        
        
        
    }
    
    
    
}
