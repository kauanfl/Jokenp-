package jokenpo;

/*Ola, meu nome é Kauan Ferreira Lemos. Eu escolhi Java por ser a linguagem
que me introduziu a programação, desde o meu primeiro curso na parte de lógica
até hoje na faculdade. Foi um projeto desafiador, pois ainda sou amador no
Java Swing, mas foi muito legal realizá-lo e descobrir coisas novas
a cada etapa.*/

public class JokenpoLogica {
   
    //Entrada de dados
    public String getEscolhaNome(int escolha){
           switch (escolha) {
               case 1:
                   return "Pedra";
                case 2:
                   return "Papel";
                case 3:
                   return "Tesoura";
                default:
                    return "inválido";
    }
}
 //Determinando o vencedor
    public String determinarVencedor(int jogador, int maquina) {
     if (jogador == maquina) {
        return "Empate!";
     }   
     
     //Saida de dados
     switch (jogador) {
         //Se a escolha for pedra
         case 1: 
             return (maquina == 3) ? "Você Ganhou!" : "Você Perdeu!";
         //Se a escolha for papel     
              case 2: 
             return (maquina == 1) ? "Você Ganhou!" : "Você Perdeu!";
          //Se a escolha for tesoura          
              case 3: 
             return (maquina == 2) ? "Você Ganhou!" : "Você Perdeu!";
              default:
                    return "inválido";
             
     }
     
        
    }
}