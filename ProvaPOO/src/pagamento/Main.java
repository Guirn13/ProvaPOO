package pagamento;

public class Main {
    public static void main(String[] args) {
        CartaoCredito CC = new CartaoCredito();
        CC.setDataHoraPagamento("2023-10-05 14:30:00");
        CC.setNumeroPagamento(12345);
        CC.setValorPago(100.0);
        CC.setNumCartao("1111-9999-5555-0000");
        CC.setTitularCartao("Guilherme");
        CC.setBandeiraCartao("Visa");

        String cupomCredito = CC.imprimirCupomFiscal();
        System.out.println(cupomCredito);

        Pix pix = new Pix(true);
        pix.setDataHoraPagamento("2023-10-05 14:45:00");
        pix.setNumeroPagamento(67890);
        pix.setValorPago(50.0);

        String cupomPix = pix.imprimirCupomFiscal();
        System.out.println(cupomPix);

        CartaoDebito CB = new CartaoDebito("0000-0000-0000-0000", "Thalita");
        CB.setDataHoraPagamento("2023-12-05 12:00:20");
        CB.setNumeroPagamento(54321);
        CB.setValorPago(75.0);

        String cupomDebito = CB.imprimirCupomFiscal();
        System.out.println(cupomDebito);
    }
}
