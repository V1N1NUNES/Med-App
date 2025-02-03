package Model;

import java.util.ArrayList;

public class Model_Pacientes extends Pessoa{

    //Atributos específicos de pacientes
    String Doenca;
    String medicamentos;

    //construtor da classe Pessoa
    public Model_Pacientes(String nome, int idade, String CPF) {
        super(nome, idade, CPF);
    }


    //ArrayList para a contagem de pacientes no sistema
    private ArrayList<String> pacientes = new ArrayList<>();


    //Getters e setters para a lista de pacientes
    public ArrayList<String> getPacientes() {
        return pacientes;
    }
    public void setPacientes(ArrayList<String> pacientes) {
        this.pacientes = pacientes;
    }


    //getters and setters
    public String getDoenca() {
        return Doenca;
    }

    public void setDoenca(String doenca) {
        Doenca = doenca;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }


    //metodos
    @Override
    protected void contagemPessoas(String CPF) {
        pacientes.add(CPF);
    }


    //IMPLEMENTAÇÕES FUTURAS NO SISTEMA
    //- Armazenamento de dados em um banco de dados
    //- Histórico médico de cada paciente
    //- ...
}
