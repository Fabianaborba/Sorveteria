
public class Doce extends ItemSobremesa {

	private double peso;
	private int precoPorQuilo;
	public int custo;
	
	
	 public void setPeso(double peso) {
	        this.peso = peso;
	    }
	
	 public void setPrecoPorQuilo(int precoPorQuilo) {
	        this.precoPorQuilo = precoPorQuilo;
	    }
	 
	 public void setCusto(int custo) {
	        this.custo = custo;
	    }
	 
	
	public double getPeso() {
        return peso;
	}
	
	public int getPrecoPorQuilo() {
        return precoPorQuilo;
	}
        
	@Override
	public int getCusto() {
		
		custo = (int)(peso * precoPorQuilo);
		
		
		return custo;
	}

	
	@Override
	public String toString() {
	  return String.format("%.2f g @ %s /kg\n%-25s %6s", getPeso(), 
	    Sorveteria.centavos2ReaisECentavos(precoPorQuilo), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
}
