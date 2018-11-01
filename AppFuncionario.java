package loja;

import java.util.Scanner;

public class AppFuncionario {
    
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	Scanner ler = new Scanner(System.in);

    	Funcionario funcionario = new Funcionario();
        FuncionarioSenior funcionarioSenior = new FuncionarioSenior ();
        Gerencia gerencia = new Gerencia();
    
       
        
        String nome, opcaoSenior;
        double valorPorHora, bonus;  
        int horasTrabalhadas;
        int opcao = 0;
        
        
        
        do {
        	
        	
        	System.out.println("1 - Cadastrar funcionario \n"
        			+ "2 - Listar \n"
        			+ "3 - Listar salários \n"
        			+ "4 - Total de funcionarios senior \n"
        			+ "5 - Funcionario com maior bonus \n"
        			+ "6 - Listar por faixa salarial \n"
        			+ "7 - Fechar");
        	
        	System.out.println("Digite a opcao");
        	opcao = input.nextInt();
        	
        	
        	switch(opcao) {
        	
        		case 1:
        			System.out.println("Digite o nome do funcionario: " );
        			nome = ler.nextLine();
        			
        			
        			System.out.println("Digite o valor de horas trabalhadas: ");
        			horasTrabalhadas = input.nextInt();
        			
        			System.out.println("Digite o valor por hora: " );
        			valorPorHora=  input.nextDouble();
        			
        			System.out.println("O funcionario que voce ira cadastrar é Senior? \n"
        					+ "Digite sim ou nao");
        			opcaoSenior = ler.next();
        			
        			if(opcaoSenior.equalsIgnoreCase("sim")) {
        				System.out.println("Digite o bonus do funcionario(se tiver) " );
            			bonus = input.nextDouble();
        			
            			gerencia.cadastrarFuncionario(nome, horasTrabalhadas, valorPorHora, bonus);
        			}
        			
        			gerencia.cadastrarFuncionario(nome, horasTrabalhadas, valorPorHora);
 			
        		break;
        		
        		case 2: 
        			gerencia.listar();
        		break;
        		
        		case 3:
        			gerencia.listarSalario();
        		break;
        		
        		case 4: 
        			gerencia.totalDeFuncionarioSenior();
        		break;
        		
        		case 5:
        			gerencia.funcionarioComMaiorBonus();
        		break;
        			 		 
        	}
        	
        	
        }while(opcao <= 7);
        
     }

}