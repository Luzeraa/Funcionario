package loja;

import java.util.ArrayList;

public class Gerencia {

    private ArrayList<Funcionario> lista;

    public Gerencia() {
        lista = new ArrayList<>();
    }

    public void cadastrarFuncionario(String nome, int horasTrabalhadas, double valorPorHora, double bonus) {
        FuncionarioSenior funcionario = new FuncionarioSenior(nome, horasTrabalhadas, valorPorHora, bonus);
        lista.add(funcionario);
    }

    public void cadastrarFuncionario(String nome, int horasTrabalhadas, double valorPorHora) {
        Funcionario funcionario = new Funcionario(nome, horasTrabalhadas, valorPorHora);
        lista.add(funcionario);
    }

    public void listar() {
        for (Funcionario funcionario : lista) {
            if (funcionario instanceof FuncionarioSenior) {
                System.out.println(funcionario.exibir());
            } else {
                System.out.println(funcionario.exibir());
            }

        }
    }

    public String listarSalario() {
        String f = "";
        for (Funcionario funcionario : lista) {
            return "Nome:" + funcionario.getNome() + "Salario: " + funcionario.salarioFinal();
        }
        return f;
    }

    public int totalDeFuncionarioSenior() {
        int totalSenior = 0;
        for (Funcionario funcionario : lista) {
            if (funcionario instanceof FuncionarioSenior) {
                return totalSenior++;
            }
        }
        return totalSenior;
    }

    public String funcionarioComMaiorBonus() {
        String f = "";
        for (Funcionario funcionario : lista) {

            if (funcionario.salarioFinal() > funcionario.salarioFinal()) {
                return funcionario.getNome();
            }
        }
        return f;
    }

}
