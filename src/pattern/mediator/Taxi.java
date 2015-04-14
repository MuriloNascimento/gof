package pattern.mediator;

public class Taxi {
	private TaxiStation taxiStation;
	private int id;
	private static int contador = 0;

	public TaxiStation getTaxiStation() {
		return taxiStation;
	}

	public void setTaxiStation(TaxiStation taxiStation) {
		this.taxiStation = taxiStation;
	}

	public Taxi(TaxiStation taxiStation) {
		super();
		this.taxiStation = taxiStation;
		this.id = Taxi.contador++;
	}
	
	public void atende(){
		try {
			Thread.sleep((long) (Math.random()*3000.0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.taxiStation.add(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Taxi.contador = contador;
	}
	
}
