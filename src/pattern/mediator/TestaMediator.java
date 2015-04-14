package pattern.mediator;

public class TestaMediator {

	public static void main(String[] args) {
		TaxiStation taxiStation = new TaxiStation();
		
		Passageiro p1 = new Passageiro(taxiStation, "Jonas");
		Passageiro p2 = new Passageiro(taxiStation, "Erick");
		Passageiro p3 = new Passageiro(taxiStation, "Fernando");
		
		Taxi t1 = new Taxi(taxiStation);
		Taxi t2 = new Taxi(taxiStation);
		
		taxiStation.add(t1);
		taxiStation.add(t2);
		
		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();

	}

}
