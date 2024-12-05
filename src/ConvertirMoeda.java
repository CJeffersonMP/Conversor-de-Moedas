import java.util.Scanner;

public class CconvertirMoeda {
    public static void convertir(String moedaBase, String moedaTarget, ConsultaMoeda consulta, Scanner leitura) {
        double valor;
        double valorconvertido;

        Moeda moeda = consulta.buscaMoeda(moedaBase, moedaTarget);
        System.out.println("A valor convertido de\n1 " + moedaBase + " = " + moeda.conversion_rate() + " " + moedaTarget);
        System.out.println("A Valor de " + moedaBase);
        valor = Double.parseDouble(leitura.nextLine());
        valorconvertido = valor * moeda.conversion_rate();
        System.out.println(valor + " " + moedaBase + " = " + valorconvertido + " " + moeda.target_code());
    }

}
