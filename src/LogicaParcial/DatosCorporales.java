package LogicaParcial;

public abstract class DatosCorporales {
	protected double peso;
	protected double altura;
	protected int edad;
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public DatosCorporales(double peso, double altura, int edad) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	public abstract double calcularTMB() throws Exception;
	
	

}
