package aula9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonasdhein
 */
public class TestaArquivo {
    
    public static void main(String[] args){
        
        try {
            //Criar arquivo
            FileWriter fileWriter = new FileWriter("nomes.txt");
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write("Jonas\n");
            bufferWriter.write("Pedro\n");
            bufferWriter.write("Paulo\n");
            bufferWriter.close();
            fileWriter.close();
            
            //Ler arquivo
            FileReader fileReader = new FileReader("nomes.txt");
            BufferedReader bufferReader = new BufferedReader(fileReader);
            
            String linha;
            do{
                linha = bufferReader.readLine();
                
                System.out.println(linha);
                
            }while(linha != null);
                    
            System.out.println("Terminou de ler o arquivo");
            
        } catch (IOException ex) {
            System.out.println("Erro ao criar arquivo: " + ex.getMessage());
        }
        
        
    }
    
}
