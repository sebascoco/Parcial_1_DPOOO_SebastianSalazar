package LogicaParcial;

public class Hombre extends DatosCorporales{
	public Hombre(double peso, double altura, int edad) {
		super(peso, altura, edad);
	}
	
	@Override
	public double calcularTMB() throws Exception {
		if(peso < 60 || peso > 110) {
			throw new Exception("El valor " + peso + " ingresado de peso del hombre esta fuera del intervalo permitido [60-110]");
		}
		else if (altura < 160 || altura > 195) {
			throw new Exception("El valor " + altura + " ingresado de altura del hombre esta fuera del intervalo permitido [160-195]");
		}
		else if (edad <= 15) {
			throw new Exception("El valor " + edad + " ingresado de edad del hombre esta fuera del intervalo permitido (>15)");
			
		}
		else {
			return 88.362  + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
		}
			
	}
}
