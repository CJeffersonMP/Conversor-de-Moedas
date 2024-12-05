import java.util.Scanner;

public class ConvertirMoeda {
    public static void convertir(String moedaBase, String moedaTarget, ConsultaMoeda consulta, Scanner leitura) {
        double valor;
        double valorconvertido;

        Moeda moeda = consulta.buscaMoeda(moedaBase, moedaTarget);
        System.out.println("O valor convertido de\n1 " + moedaBase + " equivale a " + moeda.conversion_rate() + " " + moedaTarget);
        System.out.println("Qual quantia gostaria de converter de "+moedaBase+" para "+moedaTarget);
        valor = Double.parseDouble(leitura.nextLine());
        valorconvertido = valor * moeda.conversion_rate();
        System.out.println(valor + " " + moedaBase + " = " + valorconvertido + " " + moeda.target_code());
    }

}
