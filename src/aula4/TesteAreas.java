package aula4;

/**
 *
 * @author jonasdhein
 */
public class TesteAreas {
    
    public static void main(String[] args) {
    
        //calcular a área de um retângulo
        AreaRetangulo objRet = new AreaRetangulo();
        objRet.setBase(5.2);
        objRet.setAltura(10.0);
        System.out.println("Área ret = " + objRet.calcularArea());
        
        //calcular a área de um retângulo
        AreaTriangulo objTriangulo = new AreaTriangulo();
        objTriangulo.setBase(5.9);
        objTriangulo.setAltura(12);
        System.out.println("Área tri = " + objTriangulo.calcularArea());
        
    }
    
    
}
