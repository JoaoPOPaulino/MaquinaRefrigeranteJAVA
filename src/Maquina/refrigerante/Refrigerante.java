package Maquina.refrigerante;

import java.util.Scanner;

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
        System.out.println(nome+" \t R$"+preco+" -- "+litros + " ml " + "\t || Código " + numero);
    }



    public void compra() {
        Scanner scan = new Scanner(System.in);
        int dinheiro;
        int troco;

        System.out.println("Informe seu dinheiro: (Ex: 5.00)");
        dinheiro = scan.nextInt();

        troco = (int) (dinheiro - preco);

        if(dinheiro < preco)
        {
            erro();
        }
        else
            System.out.print("Seu troco é " + troco);

        }

    private void erro()
    {
        System.out.print("O dinheiro não é suficiente. =(");
    }
}



