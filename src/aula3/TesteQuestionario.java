package aula3;

import ferramentas.Entrada;

/**
 *
 * @author jonasdhein
 */
public class TesteQuestionario {
    
    public static void main(String[] args) {
        
        Questionario[] vetorQuestoes = new Questionario[2];
        
        Questionario objQuestao1 = new Questionario();
        objQuestao1.setPergunta("Quais destes é um animal?");
        objQuestao1.setRespostaA("5");
        objQuestao1.setRespostaB("cachorro");
        objQuestao1.setRespostaC("cadeira");
        objQuestao1.setRespostaCorreta('B');
        
        vetorQuestoes[0] = objQuestao1;
        
        Questionario objQuestao2 = new Questionario();
        objQuestao2.setPergunta("Quais destes é um animal?");
        objQuestao2.setRespostaA("5");
        objQuestao2.setRespostaB("cachorro");
        objQuestao2.setRespostaC("cadeira");
        objQuestao2.setRespostaCorreta('B');
        
        vetorQuestoes[1] = objQuestao2;
        
        realizarQuestionario(vetorQuestoes);
        
    }
    
    private static void realizarQuestionario(Questionario[] questoes){
        //criar uma variável para contar os acertos
        int acertos = 0;
        
        //criar um laço de repetição
        for(int i = 0; i < questoes.length; i++){
            char resposta = Entrada.leiaChar(questoes[i].realizarPergunta());
            if(resposta == questoes[i].getRespostaCorreta()){
                acertos++;
            }
        }
        
        System.out.println("Você acertou " + acertos + " de " + questoes.length);
    }
    
}
