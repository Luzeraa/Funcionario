package appfuncionario;

public class AppFuncionario {

    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario ("Alexandre", 20, 50);
        FuncionarioSenior funcionarioSenior = new FuncionarioSenior ("Lucas", 20, 50, 100);
    
        System.out.println(funcionario.exibir());
        System.out.println("------------------");
        System.out.println(funcionarioSenior.exibir());
        System.out.println("   ");
        System.out.println("Salario final do funcionario: \n" + funcionario.salarioFinal());
        System.out.println("   ");
        System.out.println("Salario final do funcionario Senior: \n" + funcionarioSenior.salarioFinal());

    }
    
}
