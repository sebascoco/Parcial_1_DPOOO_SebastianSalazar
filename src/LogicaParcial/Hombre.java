package LogicaParcial;

public class Hombre extends DatosCorporales{
	public Hombre(double peso, double altura, int edad) {
		super(peso, altura, edad);
	}
	
	@Override
	public double calcularTMB() throws Exception {
		if(peso < 60 || peso > 110 || altura < 160 || altura > 195 || edad <= 15) {
			throw new Exception("Valores incorrectos");
		}
		return 88.362  + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
	}

}
