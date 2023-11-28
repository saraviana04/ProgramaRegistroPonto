package com.company;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Pessoa funcionario1, funcionario2, funcionario3;
  //      Funcionario id;

        funcionario1 = new Pessoa();
        funcionario2 = new Pessoa();
        funcionario3 = new Pessoa();
       // id = new Funcionario();



                    //DADOS DO FUNCIONARIO 01
        System.out.println("Dados do Primeiro funcionario: ");
        System.out.println("Digite ID do Funcioanrio: ");
        funcionario1.idFuncionario = sc.nextInt();
        System.out.println("Digite Nome: ");
        funcionario1.nome = sc.next();
        System.out.println("Digite Sobrenome: ");
        funcionario1.sobrenome = sc.next();
        System.out.println("Digite CPF: ");
        funcionario1.cpf = sc.next();
        System.out.println("Digite o Salario: ");
        funcionario1.salario = sc.nextDouble();
        System.out.println("Entre com Data de Entrada");
        funcionario1.dataDeEntrada = simpleDateFormat.parse(sc.next());
        System.out.println("Entre com Data de Nascimento");
        funcionario1.dataNascimento = simpleDateFormat.parse(sc.next());
          //DADOS DO FUNCIOANRIO 02
        System.out.println("Dados do Segundo Funcionario: ");
        System.out.println("Digite ID do Funcioanrio: ");
        funcionario2.idFuncionario = sc.nextInt();
        System.out.println("Digite Nome: ");
        funcionario2.nome = sc.next();
        System.out.println("Digite Sobrenome: ");
        funcionario2.sobrenome = sc.next();
        System.out.println("Digite CPF: ");
        funcionario2.cpf = sc.next();
        System.out.println("Digite o Salario: ");
        funcionario2.salario = sc.nextDouble();
        System.out.println("Entre com Data de Entrada");
        funcionario2.dataDeEntrada = simpleDateFormat.parse(sc.next());
        System.out.println("Entre com Data de Nascimento");
        funcionario2.dataNascimento = simpleDateFormat.parse(sc.next());


        System.out.println("1");
        funcionario1.mostraInformaçoes();
        System.out.println("2");
        funcionario2.mostraInformaçoes();
 //       System.out.println("3");
  //      funcionario3.mostraInformaçoes();
















        /*System.out.println("Seja Bem Vindo");
        System.out.println("Escolha qual programa usar");
        System.out.println("opcao (1) RegistroJava ou opcao (2) Calculadora");

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

