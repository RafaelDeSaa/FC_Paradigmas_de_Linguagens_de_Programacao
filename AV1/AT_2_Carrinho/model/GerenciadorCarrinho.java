package model;

import java.util.Scanner;

public class GerenciadorCarrinho {
    private final CarrinhoCompras carrinho;
    private final Scanner scannerTexto;
    private final Scanner scannerNumerico;

    public GerenciadorCarrinho() {
        carrinho = new CarrinhoCompras();
        scannerTexto = new Scanner(System.in);
        scannerNumerico = new Scanner(System.in);
    }

    public void iniciarSistema() {
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            String opcao = scannerTexto.nextLine();
            continuar = executarOpcao(opcao);
        }
    }

    private void mostrarMenu() {
        System.out.println("""
            1 -> Adicionar produto ao carrinho
            2 -> Aplicar acréscimo a um item
            3 -> Aplicar desconto a um item
            4 -> Aplicar acréscimo geral
            5 -> Aplicar desconto geral
            6 -> Concluir compra    
            0 -> Sair
        """);
    }

    private boolean executarOpcao(String opcao) {
        switch (opcao) {
            case "0":
                return false;

            case "1":
                adicionarProduto();
                break;

            case "2":
                aplicarAcrescimoItem();
                break;

            case "3":
                aplicarDescontoItem();
                break;

            case "4":
                aplicarAcrescimoGeral();
                break;

            case "5":
                aplicarDescontoGeral();
                break;

            case "6":
                carrinho.concluirCompra();
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
        return true;
    }

    private void adicionarProduto() {
        try {
            System.out.print("Informe o codigo do produto: ");
            int codigo = scannerNumerico.nextInt();
            scannerTexto.nextLine(); // Consome a nova linha

            System.out.print("Informe a descricao do produto: ");
            String descricao = scannerTexto.nextLine();

            System.out.print("Informe o valor do produto: ");
            double valor = scannerNumerico.nextDouble();

            carrinho.inserirProduto(codigo, descricao, valor);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar produto.");
            scannerNumerico.nextLine(); // Limpa o buffer
        }
    }

    private void aplicarAcrescimoItem() {
        try {
            System.out.print("Informe o codigo do produto: ");
            int codigo = scannerNumerico.nextInt();

            System.out.print("Informe o valor do acrescimo: ");
            double acrescimo = scannerNumerico.nextDouble();
            carrinho.aplicarAcrescimoItem(codigo, acrescimo);
        } catch (Exception e) {
            System.out.println("Erro ao aplicar acrescimo.");
            scannerNumerico.nextLine();
        }
    }

    private void aplicarDescontoItem() {
        try {
            System.out.print("Informe o codigo do produto: ");
            int codigo = scannerNumerico.nextInt();

            System.out.print("Informe o valor do desconto: ");
            double desconto = scannerNumerico.nextDouble();
            carrinho.aplicarDescontoItem(codigo, desconto);
        } catch (Exception e) {
            System.out.println("Erro ao aplicar desconto.");
            scannerNumerico.nextLine();
        }
    }

    private void aplicarAcrescimoGeral() {
        try {
            System.out.print("Informe o valor do acrescimo total: ");
            double acrescimo = scannerNumerico.nextDouble();
            carrinho.aplicarAcrescimoGeral(acrescimo);
        } catch (Exception e) {
            System.out.println("Erro ao aplicar acrescimo geral.");
            scannerNumerico.nextLine();
        }
    }

    private void aplicarDescontoGeral() {
        try {
            System.out.print("Informe o valor do desconto total: ");
            double desconto = scannerNumerico.nextDouble();
            carrinho.aplicarDescontoGeral(desconto);
        } catch (Exception e) {
            System.out.println("Erro ao aplicar desconto geral.");
            scannerNumerico.nextLine();
        }
    }
}
