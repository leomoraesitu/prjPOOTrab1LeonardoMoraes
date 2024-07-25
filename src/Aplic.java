
import java.util.Scanner;

/**
 *
 * @author leomoraes
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao;

        System.out.print("Digite o número do Quarto: ");
        int numQuarto = scan.nextInt();
        System.out.print("Digite o valor da Diaria: ");
        double valorDiaria = scan.nextDouble();

        QuartoHotel objQuarto = new QuartoHotel(numQuarto, valorDiaria);

        do {
            System.out.println("\n\n1 - Consultar quarto");
            System.out.println("2 - Reservar quarto");
            System.out.println("3 - Liberar quarto");
            System.out.println("4 - Consultar faturamento quarto");
            System.out.println("5 - Sair");
            System.out.print("\n\tDigite a opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    if (objQuarto.getSituacao() == true) {
                        System.out.print("QUARTO RESERVADO");
                    } else {
                        System.out.print("QUARTO LIVRE");
                    }
                    break;

                case 2:
                    if (objQuarto.getSituacao() == false) {
                        System.out.println("Digite seu RG: ");
                        int rg = scan.nextInt();
                        objQuarto.reservar(rg);
                    } else {
                        System.out.println("O quarto já foi reservado");
                    }
                    break;

                case 3:
                    if (objQuarto.getSituacao() == true) {
                        System.out.println("Digite o número de dias da estadia: ");
                        int dias = scan.nextInt();
                        double valorTotal = objQuarto.liberar(dias);
                        System.out.println("Valor a ser pago no quarto: R$ " + valorTotal);
                    } else {
                        System.out.println("O quarto já está livre");
                    }
                    break;
                case 4:

                    System.out.println("Faturamento Total Quarto: " + objQuarto.getTotalFaturado());

                    break;
            }
        } while (opcao < 5);
    }
}
