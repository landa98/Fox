public class Cliente {
	private Bicicleta bicicleta;

	public Bicicleta getBicicleta() {
		return this.bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}
	
	public void probarPrototype() {
		this.setBicicleta(new BicicletaMontana("Azul", 29));
		int hashcode1 = this.getBicicleta().hashCode();
		System.out.println(this.getBicicleta().verBicicleta()+" con hashcode "+hashcode1);
		this.setBicicleta((Bicicleta) this.getBicicleta().clone());
		int hashcode2 = this.getBicicleta().hashCode();		
		System.out.println("Se ha invocado método clone de objeto bicicleta");
		System.out.println(this.getBicicleta().verBicicleta()+" con hashcode "+hashcode2);
		if(hashcode1 != hashcode2) {
			System.out.println("Como los hashcodes difieren, bicicleta antes de invocar");
			System.out.println("su método clone y bicicleta después de invocarlo son dos");
			System.out.println("objetos distintos, y con mismos atributos puesto que son clones");
		}
		System.out.println("\nAhora se probará con la clase BicicletaPista\n");
		this.setBicicleta(new BicicletaPista("Roja", 26));
		int hashcode3 = this.getBicicleta().hashCode();
		System.out.println(this.getBicicleta().verBicicleta()+" con hashcode "+hashcode3);
		this.setBicicleta((Bicicleta) this.getBicicleta().clone());
		int hashcode4 = this.getBicicleta().hashCode();		
		System.out.println("Se ha invocado método clone de objeto bicicleta");
		System.out.println(this.getBicicleta().verBicicleta()+" con hashcode "+hashcode4);
		if(hashcode3 != hashcode4) {
			System.out.println("Como los hashcodes difieren, bicicleta antes de invocar");
			System.out.println("su método clone y bicicleta después de invocarlo son dos");
			System.out.println("objetos distintos, y con mismos atributos puesto que son clones");
		}
	}

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.probarPrototype();
	}
}
