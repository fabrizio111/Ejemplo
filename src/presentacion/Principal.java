package presentacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import logica.Circulo;
import logica.Cuadrado;
import logica.Cubo;
import logica.Cuerpo;
import logica.Esfera;
import logica.Figura;
import logica.Triangulo;

	public class Principal {

		public void leerBR() {

			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String dato = br.readLine();
				double d1 = Double.parseDouble(dato);
				Figura f;
				f = new Cuadrado(d1);
				System.out.println(f.calcularArea());
				System.out.println(f.calcularPerimetro());

				f = new Circulo(d1);
				System.out.println(f.calcularArea());
				System.out.println(f.calcularPerimetro());

				double d2 = Double.parseDouble(br.readLine());
				f = new Triangulo(d1, d2);
				System.out.println(f.calcularArea());
				System.out.println(f.calcularPerimetro());

				Cuerpo c;
				c = new Cubo(d1);
				System.out.println(c.calcularVolumen());

				c = new Esfera(d1);
				System.out.println(c.calcularVolumen());

				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void leerSc() {

			Scanner sc = new Scanner(System.in);
			double d1 = sc.nextDouble();
			Figura f;
			f = new Cuadrado(d1);
			System.out.println(f.calcularArea());
			System.out.println(f.calcularPerimetro());

			f = new Circulo(d1);
			System.out.println(f.calcularArea());
			System.out.println(f.calcularPerimetro());

			double d2 = sc.nextDouble();
			f = new Triangulo(d1, d2);
			System.out.println(f.calcularArea());
			System.out.println(f.calcularPerimetro());

			Cuerpo c;
			c = new Cubo(d1);
			System.out.println(c.calcularVolumen());

			c = new Esfera(d1);
			System.out.println(c.calcularVolumen());
			sc.close();
		}

		public static void main(String[] args) {
			Principal principal = new Principal();
			//principal.leerBR();
			principal.leerSc();

		}
	}



}
