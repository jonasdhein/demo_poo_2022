package ferramentas;

/************
 * TestaArquivo - versão 2.0
 * 
 * Instruções:
 * a) a construção do objeto (new) apenas define qual ser�á o nome físico do arquivo no disco
 * b) abrirLeitura() abre o arquivo para leitura, retornando falso se o arquivo não foi encontrado no disco
 * c) abrirEscrita() abre o arquivo para gravação, retornando falso se ocorreu algum erro
 * d) lerLinha() retorna uma linha lida do texto, avançando sempre para a linha seguinte. 
 *    Só pode ser utilizado se o arquivo foi aberto para leitura. Retorna null se o arquivo não estiver 
 *    aberto para leitura e retorna null quando não há linhas para ler.
 * e) escreverLinha() grava uma linha/string no arquivo. Só pode ser utilizado se o arquivo estiver
 *    aberto para gravação.
 * f) fecharArquivo() fecha o arquivo.
 */ 

public class TestaArquivo
{
     public static void main(String[] args)
     {
          Arquivo arq = new Arquivo("entrada.txt"); // constroi objeto e associa/define um nome para o arquivo, mas não abre o arquivo
          String s;
          int i = 0;
          if (arq.abrirLeitura()) // abre o arquivo para leitura
          {
               s = arq.lerLinha();
               while (s != null)
               {
                    System.out.println(i + ": " + s);
                    s = arq.lerLinha(); // lê uma linha/string do arquivo
                    i = i + 1;
               }
               arq.fecharArquivo(); // fecha o arquivo, mas mantém o objeto
          }

          if (arq.abrirEscrita()) // abre o mesmo aquivo para gravação, zerando o seu conteúdo
          {
               for (i = 0; i <= 9; i++)
               {
                    arq.escreverLinha("teste" + i); // grava uma linha/string dentro do arquivo
               }
               arq.fecharArquivo(); // fecha o arquivo
          }
     }
}
