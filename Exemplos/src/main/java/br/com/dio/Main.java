package br.com.dio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Um mapa onde a Chave é a Marca e o Valor é uma LISTA de produtos
        Map<String, List<String>> catalogo = new HashMap<>();

        // 1. Cadastrando o Mouse na Logitech
        // Se não existir a marca, cria uma lista nova com o "Mouse".
        List<String> primeiroProduto = new ArrayList<>();
        primeiroProduto.add("Mouse");

        catalogo.merge("Logitech", primeiroProduto, (listaAntiga, listaNova) -> {
            listaAntiga.addAll(listaNova); // Se a marca já existir, só adiciona o produto na lista antiga
            return listaAntiga;
        });

        // 2. Cadastrando o Teclado na Logitech (O merge vai disparar a soma das listas)
        List<String> segundoProduto = new ArrayList<>();
        segundoProduto.add("Teclado");

        catalogo.merge("Logitech", segundoProduto, (listaAntiga, listaNova) -> {
            listaAntiga.addAll(listaNova);
            return listaAntiga;
        });

        List<String> terceiroProduto = new ArrayList<>();
        terceiroProduto.add("Fone");
        catalogo.merge("Logitech", terceiroProduto, (listaAntiga, listaNova) -> {
            listaAntiga.addAll(listaNova);
            return listaAntiga;
        });
        // ==========================================
        // 🔍 AGORA SIM: A BUSCA QUE VOCÊ MENCIONOU!
        // ==========================================

        // Se eu quiser buscar todos os produtos da Logitech:
        List<String> produtosLogitech = catalogo.get("Logitech");
        System.out.println("Produtos encontrados: " + produtosLogitech);
        // Print: [Mouse, Teclado]

        // Agora você pode usar métodos de verdade da Lista, como ver o tamanho ou se contém algo:
        if (produtosLogitech != null && produtosLogitech.contains("Teclado")) {
            System.out.println("Temos teclado da Logitech no estoque!");
        }
    }
}