package aula15;

/**
 *
 * @author jonasdhein
 */
public class Quadrado implements FiguraGeometrica{

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public int getArea() {
        return 20;
    }

    
}
