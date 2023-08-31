package domain;

public class Pedra implements Algoritmo {

  @Override
  public void executar(TipoAlgoritmo tipo) {
    switch(tipo){
      case PEDRA : 
        System.out.println("EMPATE");
        break;
      case SPOCK : 
        System.out.println("Ganhou, a pedra machuca SPOCK");
        break;
      case TESOURA : 
        System.out.println("GANHOU, pedra destroi tesoura");
        break;
      case LAGARTO : 
        System.out.println("GANHOU, pedra machuca lagarto");
        break;
      default:
        System.out.println("Perdeu, papel embrulha pedra");
        
    }
      
    }
  }
  

