package pagamento;

public class Pix extends Pagamento {
    private boolean comprovanteTransacaoPix;

    public Pix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public String imprimirCupomFiscal() {
        String cupomFiscal = "Data/Hora do Pagamento: " + getDataHoraPagamento() + "\n";
        cupomFiscal += "Número do Pagamento: " + getNumeroPagamento() + "\n";
        cupomFiscal += "Valor Pago: " + getValorPago() + "\n";
        cupomFiscal += "Comprovante: " + comprovanteTransacaoPix + "\n";

        return cupomFiscal;
    }
}
