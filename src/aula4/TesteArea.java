package aula4;

/**
 *
 * @author jonasdhein
 */
public class TesteArea {
    
    public static void main(String[] args) {
        
        double l1 = 10.5;
        double l2 = 5;
        
        double resultado = calcularArea(l1, l2);
        
        System.out.println("Área = " + resultado);
        
    }
    
    private static double calcularArea(double n1, double n2){
        
        return n1 * n2;
        
    }
    
}
