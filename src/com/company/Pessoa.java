package com.company;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public String cpf;
    public double salario;
    public Date dataDeEntrada;
  public int idFuncionario;
   public Date dataNascimento;



    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {

        this.sobrenome = sobrenome;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public Date getDataDeEntrada()
    {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Date dataDeEntrada) {

        this.dataDeEntrada = dataDeEntrada;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public void mostraInformaçoes() {
        System.out.println("Id Funcionario:" + this.idFuncionario);
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("CPF:" + this.cpf);
        System.out.printf("Salário R$ "+ this.salario);
        System.out.println();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data de Entrada: " + sdf.format(this.dataDeEntrada));
        System.out.println("Nascimento: " + sdf.format(this.dataNascimento));


    }



}


class Funcionario extends Pessoa{
//  public double idFuncionario;

    private String idFuncinario;

    public String getIdFuncinario() {
        return idFuncinario;
    }

    public void setIdFuncinario(String idFuncinario) {
        this.idFuncinario = idFuncinario;
    }
}