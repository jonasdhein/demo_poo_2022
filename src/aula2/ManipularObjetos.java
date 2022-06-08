package aula2;

import modelos.Carro;
import modelos.Modelo;

/**
 *
 * @author jonasdhein
 * 
 */
public class ManipularObjetos {
    
    public static void main(String[] args) {
        
        Modelo modelo = new Modelo("Chevrolet", "Opala");
        
        Carro objCarro1 = new Carro("123456", "Azul", "Chevrolet", 
                modelo, 1980,1981);
        
        Carro objCarro2 = new Carro();
        objCarro2.setModelo(new Modelo("Chevrolet", "Opala"));
        objCarro2.setAno_fabricacao(1980);
        objCarro2.setAno_modelo(1981);
        
        //Qual dos carros é o mais novo?
        if(objCarro1.getAno_fabricacao() > objCarro2.getAno_fabricacao()){
            System.out.println("O carro 1 é o mais novo");
        }else if(objCarro1.getAno_fabricacao() == objCarro2.getAno_fabricacao()){
            System.out.println("Os carros são do mesmo ano");
        }else{
            System.out.println("O carro 2 é o mais novo");
        }
        
        
    }
    
}
