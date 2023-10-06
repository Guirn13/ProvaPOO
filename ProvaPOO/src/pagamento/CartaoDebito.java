package pagamento;

public class CartaoDebito extends Pagamento {
    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String numCartao, String titularCartao) {
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public String imprimirCupomFiscal() {
        String cupomFiscal = "Data/Hora do Pagamento: " + getDataHoraPagamento() + "\n";
        cupomFiscal += "Número do Pagamento: " + getNumeroPagamento() + "\n";
        cupomFiscal += "Valor Pago: " + getValorPago() + "\n";
        cupomFiscal += "Número do Cartão: " + numCartao + "\n";
        cupomFiscal += "Titular do Cartão: " + titularCartao + "\n";

        return cupomFiscal;
    }
}
