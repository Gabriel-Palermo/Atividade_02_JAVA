import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private class ItemPedido {
        String produto;
        int quantidade;
        double precoUnitario;

        ItemPedido(String produto, int quantidade, double precoUnitario) {
            this.produto = produto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        double valorTotal() {
            return quantidade * precoUnitario;
        }
    }

    private List<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String produto, int quantidade, double precoUnitario) {
        itens.add(new ItemPedido(produto, quantidade, precoUnitario));
    }

    public void removerItem(String produto) {
        itens.removeIf(item -> item.produto.equalsIgnoreCase(produto));
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.valorTotal();
        }
        return total;
    }

    public void listarItens() {
        System.out.println("\nItens do pedido:");
        for (ItemPedido item : itens) {
            System.out.println(item.produto + " (" + item.quantidade + ") - R$" + item.precoUnitario);
        }
    }
}