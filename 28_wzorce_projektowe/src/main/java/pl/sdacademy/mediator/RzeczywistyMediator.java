package pl.sdacademy.mediator;

import java.util.HashMap;
import java.util.Map;

class RzeczywistyMediator implements Mediator {
	private Map<String, Kolega> koledzy = new HashMap<>();

	public void zarejestrujKolege(Kolega k) {
		k.zarejestrujMediatora(this);
		koledzy.put(k.getId(), k);
	}

	public void wyslij(String adresat, String wiadomosc) {
		koledzy.get(adresat).odbierz(wiadomosc);
	}
}
