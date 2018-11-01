package loja;

import java.util.Scanner;

public class AppFuncionario {
    
    public static void main(String[] args) {
    	 Scanner ler = new Scanner(System.in);
         
        Funcionario funcionario = new Funcionario();
        FuncionarioSenior funcionarioSenior = new FuncionarioSenior ();
        Gerencia gerencia = new Gerencia();
    
       
        
        String nome, opcaoSenior;
        double horasTrabalhadas, valorPorHora, bonus;   
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
        	opcao = ler.nextInt();
        	
        	
        	switch(opcao) {
        	
        		case 1:
        			System.out.println("Digite o nome do funcionario: " );
        			nome = ler.nextLine();
        			
        			System.out.println("Digite o valor de horas trabalhadas: " );
        			horasTrabalhadas = ler.nextDouble();
        			
        			System.out.println("Digite o valor por hora: " );
        			valorPorHora=  ler.nextDouble();
        			
        			System.out.println("O funcionario que voce ira cadastrar é Senior? \n"
        					+ "Digite sim ou nao");
        			opcaoSenior = ler.nextLine();
        			
        			if(opcaoSenior.equalsIgnoreCase("sim")) {
        				System.out.println("Digite o bonus do funcionario(se tiver) " );
            			bonus = ler.nextDouble();
        			
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