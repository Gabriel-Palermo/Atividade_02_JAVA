public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Bloco do motor", 1, 4700.00);
        pedido.adicionarItem("Cabeçote", 1, 2850.00);
        pedido.adicionarItem("Velas de ignição", 6, 45.00);
        pedido.adicionarItem("Carburador", 1, 840.00);
        pedido.adicionarItem("Comando de válvulas", 1, 1290.00);
        pedido.adicionarItem("Bomba de óleo", 1, 470.00);

        pedido.listarItens();

        System.out.println("\nRemovendo o 'Carburador'...");
        pedido.removerItem("Carburador");

        pedido.listarItens();

        System.out.println("\nValor total do pedido: R$" + pedido.valorTotal());
    }
}