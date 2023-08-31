package domain;

public class Tesoura implements Algoritmo{

  @Override
  public void executar(TipoAlgoritmo tipo) {
    
    switch(tipo){
      case PEDRA :
        System.out.println("PERDEU! Pedra destroi tesoura.");
        break;
      case SPOCK :
        System.out.println("Ganhou. Tesoura corta SPOCK");
        break;
      case TESOURA :
        System.out.println("EMPATE.");
        break;
      case LAGARTO :
        System.out.println("GANHOU, tesoura decapita Lagarto");
        break;
      default :
        System.out.println("Ganhou, Tesoura corta papel");
    }
  }

  
}
