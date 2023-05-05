package ArrayList;

import jdk.management.jfr.FlightRecorderMXBean;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int opcao = 1;
        ArrayList<Cliente> listaCLiente = new ArrayList<>();

        while(opcao>0 && opcao <=4) {
            System.out.println("Menu de Cadastro Cliente");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Editar");
            System.out.println("3 - Consultar Todos");
            System.out.println("4 - Consultar por CPF");
            System.out.println("5 - Excluir");

            opcao = ent.nextInt();

            switch (opcao) {
                case 1:
                    Cliente c = new Cliente();
                    System.out.println("Cadastrar Cliente: ");
                    System.out.println("Nome: ");
                    c.setNome(ent.next());

                    System.out.println("Endereco: ");
                    c.setEndereco(ent.next());

                    System.out.println("Contato: ");
                    c.setContato(ent.next());

                    System.out.println("CPF: ");
                    c.setCpf(ent.next());

                    System.out.println("Limite de Compras: ");
                    c.setLimite(ent.nextDouble());

                    listaCLiente.add(c);
                    break;
                case 2:

                    break;
                case 3:

                break;
                case 4:
                    System.out.println("Digite o CPF do cliente: ");
                    String cpf = ent.next();

                    for (int i = 0; i < listaCLiente.size(); i++) {
                        if (listaCLiente.get(i).getCpf().equals(cpf)) {
                            System.out.println("Nome: " + listaCLiente.get(i).getNome());
                            System.out.println("Endereço: " + listaCLiente.get(i).getEndereco());
                            System.out.println("Contato: " + listaCLiente.get(i).getContato());
                            System.out.println("Limite: " + listaCLiente.get(i).getLimite());
                        }
                    }
                break;
                case 5:
                    System.out.println("Digite cpf do Cliente");
                    String info = ent.next();

                    for (int i = 0; i < listaCLiente.size(); i++) {
                        if (listaCLiente.get(i).getCpf().equals(info)) {
                            listaCLiente.remove(i);
                            System.out.println("Excluido com Sucesso!!!");
                        }
                    }
                break;
            }
        }
    }
}
