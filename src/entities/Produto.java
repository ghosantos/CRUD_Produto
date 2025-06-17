package entities;

public class Produto {
    private String name;
    private String code;
    private double preco;

    public Produto(String name, String code, double preco) {
        this.name = name;
        this.code = code;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPreco() {
        return preco;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\nCódigo: " + code + "\nPreço: R$" + preco;
    }
}
