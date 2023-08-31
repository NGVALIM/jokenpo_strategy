package domain;

public class Lagarto implements Algoritmo{

  @Override
  public void executar(TipoAlgoritmo tipo) {
    switch(tipo){
      case PEDRA :
        System.out.println("Perdeu, pedra mata Lagarto");
        break;
      case SPOCK :
        System.out.println("Ganhou, lagarto envenena SPOCK");
        break;
      case TESOURA :
        System.out.println("Perdeu, tesoura corta lagarto");
        break;
      case LAGARTO :
        System.out.println("EMPATE");
        break;
      default :
        System.out.println("Ganhou, lagarto come papel");
    }
  }
  
}
