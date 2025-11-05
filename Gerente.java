public class Gerente extends Funcionarios{
    private static final double BONUS = 2000.00;

    public Gerente(String nome, String cpf , double salario, String dataNascimento) {
        super(nome, cpf , salario, dataNascimento);
    }
    @Override
    public double getSalario(){
        return super.getSalario() + BONUS;
    }

}