
public class Sorvete extends ItemSobremesa {

	public int custo;
	
	public int setCusto(int custo) {
		 System.out.printf("Digite o valor do sorvete: \n", custo);
		 int imposto;
		 imposto = custo / 100 * 2;
		 custo = custo + imposto;
		this.custo = custo;
        return custo;
    }
	
	@Override
	public int getCusto() {
		
		return custo;
	}

	@Override
	public String toString() {
	  return String.format("%-25s %6s", getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
}
