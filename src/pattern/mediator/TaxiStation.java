package pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class TaxiStation {
	List<Taxi> taxisLivre = new ArrayList<Taxi>();
	List<Passageiro> passageirosEmEspera =  new ArrayList<Passageiro>();
	
	public synchronized void add(Taxi taxi){
		System.out.println("Taxi: "+taxi.getId()+" voltou pra fila");
		taxisLivre.add(taxi);
		this.notifyAll();
	}
	
	public void call(Passageiro passageiro){
		Taxi taxi = this.wait(passageiro);
		System.out.println("Taxi: "+taxi.getId()+" levando o passageiro "+passageiro.getName());
		taxi.atende();
	}

	private Taxi wait(Passageiro passageiro){
		this.passageirosEmEspera.add(passageiro);
		synchronized (this) {
			while (this.taxisLivre.isEmpty() || !this.passageirosEmEspera.get(0).equals(passageiro)) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.passageirosEmEspera.remove(0);
			return this.taxisLivre.remove(0);
		}
	}
}
