
public class Sundae extends ItemSobremesa {

	
	private String calda;
	private int precoDaCalda;
	public int custo;
	
	
	public String setCalda(String calda) {
        this.calda = calda;
        
        return calda;
    }

 public int setprecoDaCalda(int precodaCalda, int precoDaCalda) {
        return this.precoDaCalda = precoDaCalda;
    }
 
 public int setCusto(int custo) {
	 System.out.printf("Digite o valor do sundae: \n", custo);
	 int imposto;
	 imposto = custo / 100 * 2;
	 custo = custo + imposto;
        return this.custo = custo;
    }
 

public String getCalda() {
    return calda;
}

public int getprecoDaCalda() {
    return precoDaCalda;
}
	@Override
	public int getCusto() {
		
		return custo;
	}

	@Override
	public String toString() {
	  return String.format("Sundae de %s com\n%-25s %6s", getCobertura(), 
	    getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}

	private Object getCobertura() {
		// TODO Auto-generated method stub
		return null;
	}
}
