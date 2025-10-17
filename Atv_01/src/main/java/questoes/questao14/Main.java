package questoes.questao14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Handlers do Chain Of Resposability

        DisponibilidadeEstoque processamento1 = new DisponibilidadeEstoque();
        VerificaDesconto processamento2 = new VerificaDesconto();
        ProcessaPagamento processamento3 = new ProcessaPagamento();
        EnvioPedido processamento4 = new EnvioPedido();

        processamento1.setProximo(processamento2);
        processamento2.setProximo(processamento3);
        processamento3.setProximo(processamento4);

        //Exemplos Gerados pelo ChatGPT

        // --- Produtos eletrônicos disponíveis ---
        Produto p1 = new Produto(1, "Smartphone", "Smartphone Android 128GB", 20, 1999.90);
        Produto p2 = new Produto(2, "Notebook", "Notebook 15'' Intel i5, 8GB RAM", 15, 3499.00);
        Produto p3 = new Produto(3, "Fone Bluetooth", "Fone de ouvido sem fio", 50, 299.90);

        Produto p4 = new Produto(4, "Monitor", "Monitor LED 27'' Full HD", 25, 1249.00);
        Produto p5 = new Produto(5, "Teclado Mecânico", "Teclado RGB switch azul", 40, 459.90);
        Produto p6 = new Produto(6, "Mouse Gamer", "Mouse óptico 7200 DPI", 60, 229.90);

        // --- Itens do primeiro pedido ---
        Item item1 = new Item(p1, 21); // 1 smartphone
        Item item2 = new Item(p2, 1); // 1 notebook
        Item item3 = new Item(p3, 2); // 2 fones Bluetooth
        List<Item> itensPedido1 = Arrays.asList(item1, item2, item3);

        Pedido pedido1 = new Pedido(201, itensPedido1);

        // --- Itens do segundo pedido ---
        Item item4 = new Item(p4, 2); // 2 monitores
        Item item5 = new Item(p5, 1); // 1 teclado mecânico
        Item item6 = new Item(p6, 2); // 2 mouses gamers
        List<Item> itensPedido2 = Arrays.asList(item4, item5, item6);

        Pedido pedido2 = new Pedido(202, itensPedido2);

        processamento1.processamento(pedido1);
        processamento1.processamento(pedido2);

    }
}
