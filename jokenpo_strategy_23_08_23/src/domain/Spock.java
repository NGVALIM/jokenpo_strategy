package domain;

public class Spock implements Algoritmo{

  @Override
  public void executar(TipoAlgoritmo tipo) {
    switch(tipo){
      case PEDRA :
        System.out.println("Perdeu, pedra machuca SPOCK");
        break;
      case SPOCK :
        System.out.println("EMPATE");
        break;
      case TESOURA :
        System.out.println("PERDEU, tesoura corta SPOCK");
        break;
      case LAGARTO :
        System.out.println("Perdeu, lagarto envenena SPOCK");
        break;
      default :
        System.out.println("Ganhou, SPOCK amassa o papel");
    }
  }
  
}
