//package strategy;

/**
 *
 * @author Simo
 */
public class StrategyContext {
        
    private StrategyIF strategy;

    private String data;
    
    public StrategyContext(StrategyIF strategy) {
        this.strategy = strategy;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void modifyData(){
        data = strategy.apply(data);
    }
    
    public void modifyDataWithStrategy(StrategyIF strategy){
        data = strategy.apply(data);
    }
   
    
    
}
