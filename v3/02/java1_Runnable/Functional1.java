class Functional1{
    
    // Runnable esimerkkinä funktionaalisesta rajapinnasta

    public static void main(String[] args){
    
        Runnable r1 = new Runnable(){
            public void run(){
                System.out.println("Runnable implemented by using old way");
            }
        };
        
        Thread t1 = new Thread(r1);
        t1.start();
        
        Runnable r2 = ()->{System.out.println("Runnable implemented by using Lambda Expression");};
        Thread t2 = new Thread(r2);
        t2.start();
        
        // Yksinkertaisimmin:
        
        Thread t3 = new Thread(()->{System.out.println("Runnable implemented by using Lambda Expression");});
        t3.start();
        
    
            
    }   
    
}


