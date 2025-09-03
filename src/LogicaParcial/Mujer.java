package LogicaParcial;

public class Mujer extends DatosCorporales{
	public Mujer(double peso, double altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTMB() throws Exception {
		if(peso < 40 || peso > 80 || altura < 140 || altura > 180 || edad <= 15) {
			throw new Exception("Valores incorrectos");
		}
		return 447.593  + (9.247  * peso) + (3.098  * altura) - (4.33  * edad);
	}

}