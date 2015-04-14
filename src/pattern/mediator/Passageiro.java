package pattern.mediator;

public class Passageiro implements Runnable{
	
	private String name;
	private TaxiStation taxiStation;

	public Passageiro(TaxiStation taxiStation,String name) {
		super();
		this.name = name;
		this.taxiStation = taxiStation;
	}
	
	public void run(){
		for (int i = 0; i < 5; i++) {
			this.taxiStation.call(this);
		}
	}

	public TaxiStation getTaxiStation() {
		return taxiStation;
	}

	public void setTaxiStation(TaxiStation taxiStation) {
		this.taxiStation = taxiStation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
