package aula9;

import ferramentas.Arquivo;

/************
 * TestaArquivo - versão 2.0
 * 
 * Instruções:
 * a) a construção do objeto (new) apenas define qual será o nome físico do arquivo no disco
 * b) abrirLeitura() abre o arquivo para leitura, retornando falso se o arquivo não foi encontrado no disco
 * c) abrirEscrita() abre o arquivo para gravação, retornando falso se ocorreu algum erro
 * d) lerLinha() retorna uma linha lida do texto, avançando sempre para a linha seguinte. 
 *    Só pode ser utilizado se o arquivo foi aberto para leitura. Retorna null se o arquivo não estiver 
 *    aberto para leitura e retorna null quando não há linhas para ler.
 * e) escreverLinha() grava uma linha/string no arquivo. Só pode ser utilizado se o arquivo estiver
 *    aberto para gravação.
 * f) fecharArquivo() fecha o arquivo.
 */ 

public class TestaArquivoV2 {
    
    public static void main(String[] args) {
        
        //Ler Arquivo nomes.txt
        Arquivo objArquivo = new Arquivo("nomes.txt");
        boolean retorno = objArquivo.abrirLeitura();
        if(retorno == true){
            
            String linha;
            do{
                linha = objArquivo.lerLinha();
                
                System.out.println(linha);
                
            }while(linha != null);
            
            objArquivo.fecharArquivo();
            
        }else{
            System.out.println("O arquivo não pode ser carregado!");
        }
        
        //Escrever texto no arquivo
        objArquivo = new Arquivo("nomes2.txt");
        retorno = objArquivo.abrirEscrita();
        if(retorno == true){
            objArquivo.escreverLinha("JONAS");
            objArquivo.escreverLinha("JUCA");
            
            objArquivo.fecharArquivo();
        }else{
            System.out.println("O arquivo não pode ser carregado!");
        }
        
        
    }
    
}
