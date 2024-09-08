package app;

import controller.*;
import model.*;
import service.PlanoService;

import java.util.Scanner;

public class MenuCadastro {

    public static void cadastrarPaciente(PacienteController pacienteController, Scanner scanner,
            PlanoService planoService) {
        System.out.println("Cadastro de Paciente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("ID do Plano: ");
        int planoId = scanner.nextInt();

        Plano plano = planoService.getPlanoById(planoId);

        if (plano == null) {
            System.out.println("Plano não encontrado.");
            return;
        }

        Paciente paciente = new Paciente(0, cpf, nome, plano);
        pacienteController.addPaciente(paciente);
    }

    public static void cadastrarPlano(PlanoController planoController, Scanner scanner) {
        System.out.println("Cadastro de Plano:");
        System.out.print("Nome do Plano: ");
        String nomePlano = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Valor Mensal: ");
        double valorMensal = scanner.nextDouble();

        Plano plano = new Plano(0, nomePlano, descricao, null, null, null, valorMensal);
        planoController.addPlano(plano);
    }
}
