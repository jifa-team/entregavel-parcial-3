package app;

import controller.PacienteController;
import controller.PlanoController;
import repository.PacienteRepository;
import repository.PlanoRepository;
import service.PacienteService;
import service.PlanoService;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Instanciar repositórios
        PacienteRepository pacienteRepository = new PacienteRepository();
        PlanoRepository planoRepository = new PlanoRepository();

        // Instanciar serviços
        PacienteService pacienteService = new PacienteService(pacienteRepository);
        PlanoService planoService = new PlanoService(planoRepository);

        // Instanciar controladores
        PacienteController pacienteController = new PacienteController(pacienteService);
        PlanoController planoController = new PlanoController(planoService);

        boolean executando = true;
        while (executando) {
            exibirMenuPrincipal(pacienteController, planoController);
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    MenuCadastro.cadastrarPaciente(pacienteController, scanner, planoService);
                    break;
                case 2:
                    pacienteController.getAllPacientes().forEach(System.out::println);
                    break;
                case 3:
                    MenuCadastro.cadastrarPlano(planoController, scanner);
                    break;
                case 4:
                    planoController.getAllPlanos().forEach(System.out::println);
                    break;
                case 5:
                    executando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void exibirMenuPrincipal(PacienteController pacienteController, PlanoController planoController) {
        System.out.println("Bem-vindo ao Sistema de Gestão Odontológica - by jifa-team");
        System.out.println("1. Cadastrar Paciente");
        System.out.println("2. Listar Pacientes");
        System.out.println("3. Cadastrar Plano");
        System.out.println("4. Listar Planos");
        System.out.println("0. Sair");
    }
}
