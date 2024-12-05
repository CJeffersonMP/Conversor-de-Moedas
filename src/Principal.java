import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();

        int opcao = 0;
        while (opcao != 7){
            System.out.println("**************************************\n" +
                    "Seja bem-vindo ao convensor de moedas!\n\n" +
                    "1) Dólar =>> Peso argentino\n" +
                    "2) Peso argentino =>> Dólar\n" +
                    "3) Dólar =>> Real brasileiro\n" +
                    "4) Real brasileiro =>> Dólar\n" +
                    "5) Dólar =>> Peso colombiano\n" +
                    "6) Peso colombiano =>> Dólar\n" +
                    "7) Sair\n"+
                    "*****************************************************");

            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    ConvertirMoeda.convertir("USD", "ARS", consulta,leitura);
                    break;
                case 2:
                    ConvertirMoeda.convertir("ARS", "USD", consulta,leitura);
                    break;
                case 3:
                    ConvertirMoeda.convertir("USD", "BRL", consulta,leitura);
                    break;
                case 4:
                    ConvertirMoeda.convertir("BRL", "USD", consulta,leitura);
                    break;
                case 5:
                    ConvertirMoeda.convertir("USD", "COP", consulta,leitura);
                    break;
                case 6:
                    ConvertirMoeda.convertir("COP", "USD", consulta,leitura);
                    break;
                case 7:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opção ivalida, escolha um numero de 1 a 7");
                    break;

            }
        }
    }
}
