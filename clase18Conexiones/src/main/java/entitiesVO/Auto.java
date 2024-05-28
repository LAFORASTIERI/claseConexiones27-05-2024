package entitiesVO;

public class Auto {

	private int id;
	private String marca;
	private double precio;
	private int anio;
	private boolean km;
	
	public Auto(int id, String marca, double precio, int anio, boolean km) {
		super();
		this.id = id;
		this.marca = marca;
		this.precio = precio;
		this.anio = anio;
		this.km = km;
	}
	
	public Auto () {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isKm() {
		return km;
	}

	public void setKm(boolean km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", marca=" + marca + ", precio=" + precio + ", anio=" + anio + ", km=" + km + "]";
	}
	
	
}
