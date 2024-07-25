
/**
 *
 * @author leomoraes
 */
public class QuartoHotel {

    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;

    public QuartoHotel(int nQto, double vlrDia) {
        numQuarto = nQto;
        valorDiaria = vlrDia;
    }

    public void reservar(int rg) {
        numRG = rg;
        situacao = true;
    }

    public double liberar(int numDias) {
        double totalDiaria = numDias * valorDiaria;
        totalFaturado += totalDiaria;
        numRG = 0;
        situacao = false;
        return totalDiaria;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
}
