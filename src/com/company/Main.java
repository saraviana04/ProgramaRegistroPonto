package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Pessoa funcionario1, funcionario2;
        funcionario f01, f02;

        funcionario1 = new Pessoa();
        funcionario2 = new Pessoa();
        f01 = new funcionario();
        f02 = new funcionario();

    System.out.println("Dados do Primeiro funcionario: ");
    System.out.println("Digite Nome: ");
    funcionario1.nome = sc.next();
    System.out.println("Digite Sobrenome: ");
    funcionario1.sobrenome = sc.next();
    System.out.println("Digite CPF: ");
    funcionario1.cpf = sc.next();
    System.out.println("Entre com Data de Nascimento");
    funcionario1.dataNascimento = simpleDateFormat.parse(sc.next());
    System.out.println("Digite Id do Funcionario");
    f01.IdFuncionario = sc.nextInt();
    System.out.println("Digite Data de Entrada na Empresa");
    f01.dataDeEntrada = simpleDateFormat.parse(sc.next());
    System.out.println("Digite o salario do funcionario");
    f01.salario = sc.nextDouble();

    System.out.println("Dados do Segundo Funcionario: ");
    System.out.println("Digite Nome: ");
    funcionario2.nome = sc.next();
    System.out.println("Digite Sobrenome: ");
    funcionario2.sobrenome = sc.next();
    System.out.println("Digite CPF: ");
    funcionario2.cpf = sc.next();
    System.out.println("Entre com Data de Nascimento");
    funcionario2.dataNascimento = simpleDateFormat.parse(sc.next());
    System.out.println("Digite Id do Funcionario");
    f02.IdFuncionario = sc.nextInt();
    System.out.println("Digite Data de Entrada na Empresa");
    f02.dataDeEntrada = simpleDateFormat.parse(sc.next());
    System.out.println("Digite o salario do funcionario");
    f02.salario = sc.nextDouble();


    System.out.println("Funcionario 01");
    funcionario1.mostraInformaçoes();
    f01.dadosFuncionario();
    System.out.println();
    System.out.println("Funcionario 02");
    funcionario2.mostraInformaçoes();
    f02.dadosFuncionario();
    System.out.println();
    System.out.println("Obrigada por utilizar o sistema de Registro");






        /*System.out.println("Seja Bem Vindo");
        System.out.println("Escolha qual programa usar");
        System.out.println("opcao (1) Programa para Calculo de Hora Trabalhadas ou opcao (2) Calculadora");

        int opcao = Integer.parseInt(sc.nextLine());
        if (opcao == 1) {
            RegistroJava.executa(sc);
        }
        if (opcao == 2) {
            Calculadora.executa(sc);
        } else {
            System.out.println("Operacao invalida :-(");
        }*/

    }
}

