package LogicaParcial;

public class Mujer extends DatosCorporales{
	public Mujer(double peso, double altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTMB() throws Exception {
		if(peso < 40 || peso > 80) {
			throw new Exception("El valor " + peso + " ingresado de peso de la mujer esta fuera del intervalo permitido [40-80]");
		}
		else if (altura < 140 || altura > 180) {
			throw new Exception("El valor " + altura + " ingresado de altura de la mujer esta fuera del intervalo permitido [140-180]");
		}
		else if (edad <= 15) {
			throw new Exception("El valor " + edad + " ingresado de edad de la mujer esta fuera del intervalo permitido (>15)");
			
		}
		else {
			return 447.593  + (9.247  * peso) + (3.098  * altura) - (4.33  * edad);
	}
	}
}