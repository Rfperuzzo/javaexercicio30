# Repetidor de Frases com `do-while` em Java

Projeto simples desenvolvido em Java para praticar o uso da estrutura de repetição `do-while`.

## 📌 Descrição

O programa solicita ao usuário:

- Uma frase;
- Um número inteiro indicando quantas vezes a frase deverá ser exibida.

Depois disso, o programa utiliza um laço `do-while` para repetir a frase a quantidade de vezes informada.

## 💻 Exemplo de execução

```text
Digite uma frase
Estou aprendendo Java

Digite um número
3

Estou aprendendo Java
Estou aprendendo Java
Estou aprendendo Java
```

## 🧠 Conceitos utilizados

- `Scanner`
- Variáveis
- `String`
- Entrada de dados
- Estrutura de repetição `do-while`
- Incremento de variável
- Condição de repetição

## 🔁 Funcionamento do `do-while`

O bloco dentro do `do` é executado primeiro e somente depois a condição do `while` é verificada.

```java
do {
    System.out.println(frase);
    i = i + 1;
} while (i < num);
```

A variável `i` funciona como um contador.

Ela começa em `0` e aumenta em `1` a cada repetição até atingir o número informado pelo usuário.

## 🚀 Tecnologias

- Java
- Scanner (`java.util.Scanner`)

## 📚 Objetivo

Exercício desenvolvido para estudar e praticar estruturas de repetição em Java, principalmente o comando `do-while`.
