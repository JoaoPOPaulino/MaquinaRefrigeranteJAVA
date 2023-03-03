package Maquina.refrigerante;

public class Refrigerante {

    private int numero;

    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    private int litros;

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public Refrigerante(String nome, Double preco, int litros, int numero) {
        this.nome = nome;
        this.preco = preco;
        this.litros = litros;
        this.numero = numero;
    }

    public void mostrarProdutos()
    {
        System.out.println(nome+" \t R$"+preco+" -- "+litros +" ml " + "\t || Código " + numero);
    }



    public void compra(Double dinheiro, int numero, Double troco2) {
        Double troco;
        dinheiro = dinheiro;
        if(numero == 1) {
            troco = dinheiro - 5;

            System.out.println("Seu troco é ".concat(troco.toString()) );
        }
        if(numero == 2) {
            troco = dinheiro - 3;

            System.out.println("Seu troco é ".concat(troco.toString()) );
        }
        if(numero == 3) {
            troco = dinheiro - 3;

            System.out.println("Seu troco é ".concat(troco.toString()) );
        }
        if(numero == 4) {
            troco = dinheiro - 7;

            System.out.println("Seu troco é ".concat(troco.toString()) );
        }
        return;
    }


}
