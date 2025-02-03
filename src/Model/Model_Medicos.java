package Model;

import java.util.ArrayList;
import java.util.List;

public class Model_Medicos extends Pessoa{

    //Atributos específicos de médicos
    float CRM;
    String especialidade;


    //ArrayList para o armazenamento de dados dos médicos no sistema
    ArrayList<String> Medicos = new ArrayList<>();


    //construtor da classe Pessoa
    public Model_Medicos(String nome, int idade, String CPF, float CRM, String especialidade) {
        super(nome, idade, CPF);
        this.CRM =  CRM;
        this.especialidade = especialidade;
        contagemPessoas(CPF);
    }


    //getters and setters
    public float getCRM() {
        return CRM;
    }
    public void setCRM(float CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    //metodos
    @Override
    protected void contagemPessoas(String CPF) {
        Medicos.add(CPF);
    }

    //consultar paciente: Busca por CPF, diagnóstico e prescrição médica



    //IMPLEMENTAÇÕES FUTURAS NO SISTEMA
    //- Armazenamento de dados em um banco de dados
    //- Definição de dias que os médicos trabalham
    //- Status de médico ocupado ou não durante a compilação
    //-
}
