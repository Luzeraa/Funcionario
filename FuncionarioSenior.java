package loja;

public class FuncionarioSenior extends Funcionario {
    private  double bonus;
    
    
    public FuncionarioSenior() {
    	
    }
    
    public FuncionarioSenior( String nome, double horasTrabalhadas, double valorPorHora, double bonus){
        super(nome, horasTrabalhadas, valorPorHora);
        this.bonus = bonus;
    }
    
    
    
    public double getBonus() {
		return bonus;
	}
    
    


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}



	@Override
    public double salarioFinal(){
        return (getHorasTrabalhadas()*getValorPorHora())+((getHorasTrabalhadas()/10) * bonus);
        
    }
     
    @Override
    public String exibir(){
        return "Nome: " + getNome() + " \nHoras Trabalhadas: " + getHorasTrabalhadas() + "\n"
                + "Salario por hora: " + getValorPorHora() + "\nSalario final: " + salarioFinal() + "\nBonus: " + bonus ;
    }
}
