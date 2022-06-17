package logica;

public class Fecha	{
  //Atributos
		private String nombre;
		private String marca;
		private double consumo;
		
		//constructor por defecto
		public Fecha() {
			
		}
		
		//constructor especifico 
		public Fecha (String n, String m, double c) {
			nombre=n;
			marca=m;
			consumo=c;
		}
		
		//getter
		public String getNombre() {
			return nombre;
		}
		public String getMarca() {
			return marca;
		}
		public double getConsumo() {
			return consumo;
		}
		
		//setter
		public void setNombre(String n) {
			nombre=n;
			
		}
		public void setMarca(String m) {
			marca=m;
		}
		
		public void setConsumo(double c) {
			consumo=c;
		}
		
		@Override
		public String toString() {
			return "Nombre:" +nombre+ " Marca:" + marca + " Consumo:" + consumo;
		}
  
	

	
	
}