package pagamento;

public class CartaoCredito extends Pagamento {
    private String numCartao;
    private String titularCartao;
    private String bandeiraCartao;

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeira) {
        this.bandeiraCartao = bandeira;
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
        cupomFiscal += "Bandeira cartão: " + bandeiraCartao + "\n";

        return cupomFiscal;
    }
}
