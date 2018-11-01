
public class Cookie extends ItemSobremesa {

	
	private int numero;
	private int precoPorDuzia;
	public int  custo;
	
	class Cookie = new Cookie;

		
	public void setNumero(int numero) {
	        this.numero = numero;
	    }
	
	 public void setprecoPorDuzia(int precoPorDuzia) {
	        this.precoPorDuzia = precoPorDuzia;
	    }
	 
	 public void setCusto(int custo) {
		 System.out.printf("Digite o valor do cookie: \n", custo);
		 int imposto;
		 imposto = custo / 100 * 2;
		 custo = custo + imposto;
	        this.custo = custo;
	    }
	 
	
	public int getNumero() {
        return numero;
	}
	
	public int getPrecoPorDuzia() {
        return precoPorDuzia;
	}


	@Override
	public int getCusto() {
		return custo;
		
	}
	@Override
	public String toString() {
	  return String.format("%d @ %s /dz\n%-25s %6s", getNumero(), 
	    Sorveteria.centavos2ReaisECentavos(getPrecoPorDuzia()), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
}
