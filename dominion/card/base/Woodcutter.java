package dominion.card.base;
import java.util.*;

import dominion.*;
import dominion.card.*;

/**
 * Carte Bûcheron (Woodcutter)
 * 
 * +1 Achat.
 * +2 Pièces.
 */
public class Woodcutter extends ActionCard {

	public Woodcutter(String name, int cost) {
		super(name, cost);
	}

	@Override
	public void play(Player p) {
		p.incrementBuys(1); 	// +1 Achat
		p.incrementMoney(2);	// +2 Pièces	
		
		p.incrementActions(-1);	// -1 Action pour l'utilisation de la carte
	}
}