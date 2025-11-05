import java.util.ArrayList;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar Gerente");
            System.out.println("2. Adicionar Atendente");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Mostrar Salário por CPF");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nomeG = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfG = scanner.nextLine();
                    System.out.print("Salário base: ");
                    double salarioG = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Data de nascimento: ");
                    String nascimentoG = scanner.nextLine();
                    funcionarios.add(new Gerente(nomeG, cpfG, salarioG, nascimentoG));
                    System.out.println("Gerente adicionado!");
                }

                case 2 -> {
                    System.out.print("Nome: ");
                    String nomeA = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfA = scanner.nextLine();
                    System.out.print("Salário base: ");
                    double salarioA = scanner.nextDouble();
                    System.out.print("Comissão: ");
                    double comissao = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Data de nascimento: ");
                    String nascimentoA = scanner.nextLine();
                    funcionarios.add(new Atendente(nomeA, cpfA, salarioA, nascimentoA, comissao));
                    System.out.println("Atendente adicionado!");
                }

                case 3 -> {
                    System.out.println("\n--- Funcionários ---");
                    for (Funcionarios f : funcionarios) {
                        System.out.println(f);
                    }
                }

                case 4 -> {
                    System.out.print("Informe o CPF: ");
                    String buscaCpf = scanner.nextLine();
                    boolean encontrado = false;
                    for (Funcionarios f : funcionarios) {
                        if (f.getCpf().equals(buscaCpf)) {
                            System.out.println("Salário: R$" + f.getSalario());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado.");
                    }
                }

                case 0 -> System.out.println("Encerrando...");

                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

