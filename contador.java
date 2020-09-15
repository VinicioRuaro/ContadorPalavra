package Teste;
import java.util.concurrent.RecursiveTask;

public class contador extends RecursiveTask<Long> {
    int atual;
    ArrayList<String> entrada = new ArrayList();
    public contador(int atual,ArrayList<String> entrada, ArrayList<int> usado) {
        this.atual=atual;
        this.entrada
    }
    
    @Override
    protected Void compute(){
        
        if(atual == um){
            return um;
        }
        else if(atual == zero){
            return zero;
        }
        
        
        
        
        contador c1 = new contador(atual+2);
        c1.fork();
         
        
        
        
        }
        
    
}
