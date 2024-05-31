package main.java.list.OperacoesBasicas;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;
    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome) {
        if (!carrinhoDeCompras.isEmpty()) {
        List<Item> itemParaRemover = new ArrayList<>();
            for (Item i : carrinhoDeCompras) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            carrinhoDeCompras.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void calcularValorTotal(){
        double valorTotal = 0;
        for (Item i: carrinhoDeCompras){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        if (carrinhoDeCompras.size() == 0) {
            System.out.println("Carrinho está vazio");
        } else {
            System.out.println("O Valor total é R$ " + valorTotal);
        }
    }
    public void exibirItens() {
        if (carrinhoDeCompras.size() == 0) {
            System.out.println("Não existem itens no carrinho!");
        } else {
            System.out.println(carrinhoDeCompras);
        }
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Lapis",5,2);
        carrinhoDeCompras.adicionarItem("Caneta",10.00,2);
        carrinhoDeCompras.adicionarItem("Tesoura",10.00,2);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();



        carrinhoDeCompras.removerItem("Lapis");
        carrinhoDeCompras.removerItem("Caneta");

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.calcularValorTotal();


    }
}
