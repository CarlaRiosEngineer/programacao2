public class Funcionarios {
   private String nome;
   private String cpf;
   private double salario;
   private String dataNascimento;

   public Funcionarios(String nome, String cpf, double salario, String dataNascimento) {
      this.nome = nome;
      this.cpf = cpf;
      this.salario = salario;
      this.dataNascimento = dataNascimento;
   }

   public double getSalario() {
      return this.salario;
   }

   public String getCpf() {
      return this.cpf;
   }

   public String getnome() {
      return this.nome;
   }

   public String getdataNascimento() {
      return this.dataNascimento;
   }
}
