package br.edu.utfpr.projeto_web_back.server.enums;

public enum FormaPagamentoEnum {
    BOLETO(0),
    CARTAO_CREDITO(1),
    CARTAO_DEBITO(2),
    PIX(3);

    private int codigoForma;
    FormaPagamentoEnum(int codigoForma) {
        this.codigoForma = codigoForma;
    }

    public int getCodigoForma() {
        return codigoForma;
    }
}
