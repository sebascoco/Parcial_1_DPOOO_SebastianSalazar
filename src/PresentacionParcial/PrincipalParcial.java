package PresentacionParcial;

import LogicaParcial.DatosCorporales;
import LogicaParcial.Hombre;
import LogicaParcial.Mujer;

public class PrincipalParcial {
	public static void main(String[] args) {
		DatosCorporales hombre = new Hombre(80, 180, 80);
		DatosCorporales mujer = new Mujer(80, 170,80);
		
		try {
			System.out.println("TMB calculada del Hombre: " + hombre.calcularTMB());
			System.out.println("TMB calculada de la Mujer: " + mujer.calcularTMB());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
