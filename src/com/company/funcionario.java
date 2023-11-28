package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class funcionario {

    public int IdFuncionario;
    public Date dataDeEntrada;
    public int dataSaida;
    public double salario;

    public int getIdFuncionario() {
        return IdFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        IdFuncionario = idFuncionario;
    }

    public Date getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(Date dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public int getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(int dataSaida) {
        this.dataSaida = dataSaida;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

     public void dadosFuncionario(){
         System.out.println("Id Funcionario: " + this.IdFuncionario);
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         System.out.println("Data de entrada: " + sdf.format(this.dataDeEntrada));
         System.out.printf("Salario R$: %.2f reais" + this.salario);
     }

}
