public class Atendente extends Funcionarios {
    private double comissao;
    public Atendente(String nome, String cpf,double salario, String dataNascimento,double comissao) {
        super (nome,cpf, salario, dataNascimento);
        this.comissao = comissao;  
    }
    @Override
    public double getSalario(){
        return super.getSalario() + comissao;

    }
    
}