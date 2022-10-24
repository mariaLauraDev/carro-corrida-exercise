import java.util.Scanner;

public class PistaDeCorrida {
    public static void main(String[] args) {
        Piloto maria = new Piloto ("Maria",22,Sexo.FEMININO,"01");
        CarroCorrida carroMaria = new CarroCorrida(1,maria,60.0F,0.0F,false);

        Piloto nath= new Piloto ("Nath",24,Sexo.FEMININO,"02");
        CarroCorrida carroNath = new CarroCorrida(1,nath,60.0F,0.0F,false);

        System.out.println("-------- Preparar veículos --------");
        carroMaria.ligar();
        carroNath.ligar();

        System.out.println("-------- Largada da pista --------");

        carroMaria.acelerar(10.F, carroMaria.getVelocidadeAtual());
        carroNath.acelerar(70.0F, carroNath.getVelocidadeAtual());


        System.out.println("-------- Redução de velocidade --------");
        carroMaria.frear(5.0F, carroMaria.getVelocidadeAtual());
        carroNath.frear(50F, carroNath.getVelocidadeAtual());

        System.out.println("-------- Desligar carros --------");
        carroMaria.parar(carroMaria.getVelocidadeAtual());
        carroNath.parar(carroNath.getVelocidadeAtual());

        carroMaria.desligar();
        carroNath.desligar();


    }
}
