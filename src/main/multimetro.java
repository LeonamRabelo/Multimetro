package main;
import java.util.*;
/**
 *
 * @author Lion
 */
public class multimetro{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double voltagem[] = new double[10];
        double somaV = 0 ,somaS = 0;
        float mediaV, desvio;
        
            for(int i = 0; i<10; i++){
            System.out.printf("Entre com a %d medição", i+1);
            voltagem[i] = entrada.nextDouble();
            somaV = somaV + voltagem[i];
            }
            mediaV = (float)(somaV/10);
        
        for(int i=0; i<10; i++){
        somaS = somaS + (voltagem[i] - mediaV) * (voltagem[i] - mediaV);
        }
        desvio = (float) Math.sqrt(somaS/10);
        
        for(int i =0; i<10; i++){
        System.out.printf("\nVoltagem %d: %f", i+1, voltagem[i]);
        }
        System.out.printf("\n\nA media das voltagens: %f", mediaV);
        System.out.printf("\nO desvio: %f", desvio);
        
            if(desvio < (0.1 * mediaV)){
                System.out.println("\nMultimetro está apto para uso.");
            }else{
                System.out.println("\nMultimetro não está apto para uso.");
            }
    }
    
}
