package application;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();

        System.out.println("====================================");
        System.out.println("  Olá, seja bem-vindo! ✨");
        System.out.println("====================================\n");

        int option;

        do {
            System.out.println(
                    """
                    \n=========== 📋 MENU ===========\n
                    1 - 📥 Adicionar produto
                    2 - 🗂️ Listar produtos
                    3 - 🔍 Buscar por código
                    4 - 📝 Atualizar dados do produto
                    5 - 🗑️ Remover produto
                    0 - 🚪 Sair
                    \n===============================
                    """
            );

            System.out.print("Selecione a opção: ");
            option = sc.nextInt();
            sc.nextLine(); // limpa buffer

            System.out.println();

            switch (option) {
                case 1: {

                    char resposta;

                    do {
                        System.out.print("📦Nome do Produto: ");
                        String nomeProduto = sc.nextLine();

                        System.out.print("🔢Código: ");
                        String codigo = sc.next();

                        System.out.print("💲Preço: ");
                        double preco = sc.nextDouble();

                        Produto produto = new Produto(nomeProduto, codigo, preco);
                        list.add(produto);
                        System.out.println("🤩 Produto cadastrado com sucesso!");

                        System.out.print("Deseja cadastrar outro item? (y/n): ");
                        resposta = sc.next().toLowerCase().charAt(0);
                        System.out.println();
                        sc.nextLine(); // limpa buffer

                        if (resposta == 'n') {
                            System.out.println("Encerrando cadastro.\n");
                            break;
                        } else if (resposta != 'y') {
                            System.out.println("❌Opção inválida. Encerrando cadastro por segurança.\n");
                            break;
                        }
                    } while (resposta == 'y');

                    break;
                }

                case 2: {
                    boolean encontrouProduto = false;

                    System.out.println("📋 Lista de Produtos:\n");

                    for (Produto p : list) {
                        if (p != null) {
                            System.out.println(p);
                            encontrouProduto = true;
                        }

                    }

                    if (!encontrouProduto) {
                        System.out.println("❌ Nenhum produto cadastrado.\n");
                    }

                    System.out.println("\n✅ Fim da lista. Retornando ao menu principal.");

                    break;
                }

                case 3: {
                    char resposta;

                    do {
                        System.out.print("Digite o código: ");
                        String codigo = sc.next();
                        sc.nextLine(); // limpa buffer

                        boolean encontrouCodigo = false;

                        for (Produto p : list) {
                            if (p != null && codigo.equals(p.getCode())) {
                                System.out.println("\n✅ Código encontrado!\n");
                                System.out.println(p);
                                encontrouCodigo = true;
                                break;
                            }
                        }

                        if (!encontrouCodigo) {
                            System.out.println("\n❌ Código inexistente.\n");
                        }

                        System.out.print("\nDeseja realizar mais uma busca? (y/n): ");
                        resposta = sc.next().toLowerCase().charAt(0);
                        sc.nextLine(); // limpa buffer

                    } while (resposta == 'y');

                    System.out.println("\n🔁 Retornando ao menu principal...\n");
                    break;
                }

                case 4: {
                    System.out.print("Digite o código do produto que deseja alterar: ");
                    String codigoProduto = sc.nextLine();
                    boolean encontrouCodigo = false;

                    for (Produto p : list) {
                        if (codigoProduto.equals(p.getCode())) {
                            System.out.println("\n✅ Produto encontrado!\n");
                            System.out.println(p);
                            encontrouCodigo = true;

                            System.out.print("\nO que deseja alterar no produto? (Nome, Codigo, Preco): ");
                            String resposta = sc.nextLine();

                            if (resposta.equalsIgnoreCase("nome")) {
                                System.out.print("Novo nome: ");
                                String novoNome = sc.nextLine();
                                p.setName(novoNome);

                            } else if (resposta.equalsIgnoreCase("codigo")) {
                                System.out.print("Novo código: ");
                                String novoCodigo = sc.nextLine();
                                p.setCode(novoCodigo);

                            } else if (resposta.equalsIgnoreCase("preco")) {
                                System.out.print("Novo preço: ");
                                double novoPreco = sc.nextDouble();
                                sc.nextLine(); // limpa o \n pendente
                                p.setPreco(novoPreco);

                            } else {
                                System.out.println("⚠️ Opção inválida.");
                                break;
                            }

                            System.out.println("\n✅ Dados atualizados:");
                            System.out.println(p);
                            break; // Sai do for depois de atualizar
                        }
                    }

                    if (!encontrouCodigo) {
                        System.out.println("\n❌ Produto não encontrado.\n");
                    }

                    break;
                }

                case 5: {
                    System.out.print("Digite o código do produto que deseja remover: ");
                    String codigoProduto = sc.nextLine();
                    boolean encontrouProduto = false;

                    Produto produtoParaRemover = null;

                    for (Produto p : list) {
                        if (codigoProduto.equals(p.getCode())) {
                            produtoParaRemover = p;
                            encontrouProduto = true;
                            break;
                        }
                    }

                    if (encontrouProduto) {
                        list.remove(produtoParaRemover);
                        System.out.println("\n✅ Produto removido com sucesso!\n");
                    } else {
                        System.out.println("❌ Produto não encontrado.\n");
                    }

                    // Mostrar lista atualizada (opcional)
                    if (list.isEmpty()) {
                        System.out.println("🗂️ Nenhum produto na lista.");
                    } else {
                        System.out.println("📋 Lista atualizada de produtos:");
                        for (Produto p : list) {
                            System.out.println(p);
                        }
                    }

                    break;
                }


                case 0: {
                    System.out.println("👋 Saindo do programa. Até logo!\n");
                    break;
                }

                default: {
                    System.out.println("❌ Opção inválida. Tente novamente.\n");
                }
                break;
            }


        } while(option !=0);

        sc.close();
}
}
