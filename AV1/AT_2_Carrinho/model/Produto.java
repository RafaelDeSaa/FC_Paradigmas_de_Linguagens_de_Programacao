package model;

public class Produto {
    private int codigo;
    private double aumento;
    private double desconto;
    private double total;
    private String descricao;

    public Produto(int codigo, double valorInicial, String descricao) {
        this.codigo = codigo;
        this.aumento = 0;
        this.desconto = 0;
        this.total = valorInicial;
        this.descricao = descricao;
    }

    public void adicionarAcrescimo(double valorAcrescimo) {
        this.aumento += valorAcrescimo;
        this.total += valorAcrescimo;
    }

    public void adicionarDesconto(double valorDesconto) {
        this.desconto += valorDesconto;
        this.total -= valorDesconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getAumento() {
        return aumento;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "Codigo=" + codigo +
                ", Acrescimo=" + aumento +
                ", Desconto=" + desconto +
                ", Valor Total=" + total +
                ", Descricao='" + descricao + '\'' +
                '}';
    }
}
