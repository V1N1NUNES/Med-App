package Model;

import java.util.ArrayList;

abstract public class Pessoa {

    //construtor
    public Pessoa(String nome, int idade, String CPF){
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        contagemGeral(CPF);
        contadorPessoas++;
    }

    //atributos para uma pessoa
    private String nome;
    private int idade;
    private String CPF;
    private static double contadorPessoas;


    //ArrayLists para contagem de pessoas em geral no sistema    // Depois de pronto armazenar no banco de dados
    private static ArrayList<String> geral = new ArrayList<>();


    //Getters and Setters para listas
    public static ArrayList<String> getGeral() {
        return geral;
    }
    public static void setGeral(ArrayList<String> geral) {
        Pessoa.geral = geral;
    }


    //Getters and Setterns para atributos
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCPF(){
        return CPF;
    }
    public void setNome(String Novo_nome){
        nome=Novo_nome;
    }
    public void setIdade(int Nova_idade){
        idade = Nova_idade;
    }
    public void setCPF(String Novo_CPF){
        CPF = Novo_CPF;
    }


    //Métodos
    private void contagemGeral(String CPF){
        geral.add(CPF);
    }

    protected abstract void contagemPessoas(String CPF);



    //IMPLEMENTAÇÕES FUTURAS NO SISTEMA
    //- Armazenamento de dados gerais no banco de dados
    //-
}
