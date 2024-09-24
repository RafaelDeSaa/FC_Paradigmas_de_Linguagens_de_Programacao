package model;

import java.util.ArrayList;

public class CarrinhoCompras {
     private ArrayList<Produto> produtos = new ArrayList<>();

     public void aplicarAcrescimoGeral(double valorAcrescimo) {
          if (valorAcrescimo <= 0) {
               System.out.println("Valor invalido para acrescimo.");
               return;
          }

          double acrescimoPorProduto = valorAcrescimo / produtos.size();

          produtos.forEach(produto -> produto.adicionarAcrescimo(acrescimoPorProduto));
     }

     public void aplicarDescontoGeral(double valorDesconto) {
          if (valorDesconto <= 0) {
               System.out.println("Valor invalido para desconto.");
               return;
          }

          double descontoPorProduto = valorDesconto / produtos.size();

          produtos.forEach(produto -> produto.adicionarDesconto(descontoPorProduto));
     }

     public void aplicarAcrescimoItem(int codigoProduto, double valorAcrescimo) {
          if (valorAcrescimo <= 0) {
               System.out.println("Acrescimo invalido.");
               return;
          }

          Produto produto = buscarProdutoPorCodigo(codigoProduto);

          if (produto == null) {
               System.out.println("Produto nao encontrado.");
          } else {
               produto.adicionarAcrescimo(valorAcrescimo);
          }
     }

     public void aplicarDescontoItem(int codigoProduto, double valorDesconto) {
          if (valorDesconto <= 0) {
               System.out.println("Desconto invalido.");
               return;
          }

          Produto produto = buscarProdutoPorCodigo(codigoProduto);

          if (produto == null) {
               System.out.println("Produto nao encontrado.");
          } else {
               produto.adicionarDesconto(valorDesconto);
          }
     }

     public Produto buscarProdutoPorCodigo(int codigo) {
          for (Produto produto : produtos) {
               if (produto.getCodigo() == codigo) {
                    return produto;
               }
          }
          return null;
     }

     public void inserirProduto(int codigo, String descricao, double valor) {
          Produto produto = buscarProdutoPorCodigo(codigo);

          if (produto == null) {
               produtos.add(new Produto(codigo, valor, descricao));
          }
     }

     public void concluirCompra() {
          System.out.println("Lista de Produtos no Carrinho:");
          produtos.forEach(produto -> System.out.println(produto));

          double valorTotal = 0;
          double totalAcrescimo = 0;
          double totalDesconto = 0;

          for (Produto produto : produtos) {
               totalAcrescimo += produto.getAumento();
               totalDesconto += produto.getDesconto();
               valorTotal += produto.getTotal();
          }

          System.out.println("Total de Descontos: " + totalDesconto);
          System.out.println("Total de Acrescimos: " + totalAcrescimo);
          System.out.println("Valor Final da Compra: " + valorTotal);
     }
}
