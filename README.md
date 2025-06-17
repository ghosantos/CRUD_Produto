
# 🛒 Sistema de Cadastro de Produtos – Java Console

Este é um projeto simples em Java que simula um sistema de cadastro e gerenciamento de produtos via **interface de linha de comando (CLI)**. Ideal para praticar os conceitos de:

- Orientação a Objetos
- Manipulação de listas com `ArrayList`
- Controle de fluxo com `switch` e `do/while`
- Leitura de dados com `Scanner`

---

## 🚀 Funcionalidades

- ✅ **Adicionar produto** (nome, código e preço)
- 📋 **Listar todos os produtos cadastrados**
- 🔍 **Buscar produto por código**
- ✏️ **Editar dados de um produto (nome, código ou preço)**
- ❌ **Remover produto pelo código**
- 🚪 **Sair do programa**

---

## 📦 Estrutura do Projeto

```
src/
├── application/
│   └── Program.java        // Classe principal com o menu
└── entities/
    └── Produto.java        // Classe Produto com atributos e métodos
```

---

## 🧪 Exemplo de Uso

```
=========== 📋 MENU ===========

1 - 📥 Adicionar produto
2 - 🗂️ Listar produtos
3 - 🔍 Buscar por código
4 - 📝 Atualizar dados do produto
5 - 🗑️ Remover produto
0 - 🚪 Sair

===============================
Selecione a opção: 1

📦 Nome do Produto: Teclado Gamer
🔢 Código: TKG123
💲 Preço: 199.90

🤩 Produto cadastrado com sucesso!
```

---

## 🛠️ Requisitos

- Java 8 ou superior
- IDE como IntelliJ, Eclipse ou compilação manual via terminal

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. Abra o projeto em sua IDE Java preferida **ou** compile pelo terminal:
   ```bash
   javac application/Program.java entities/Produto.java
   java application.Program
   ```

---

## 📚 Aprendizados

Este projeto foi desenvolvido para treinar:

- Estrutura de menus interativos em Java
- Leitura e validação de entradas do usuário
- Encapsulamento com classes (`Produto`)
- Manipulação de listas (`List<Produto>`)

---

## 📄 Licença

Este projeto é de uso livre para fins de aprendizado e prática. 🚀
