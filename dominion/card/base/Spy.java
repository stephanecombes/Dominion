package dominion.card.base;

import dominion.*;
import dominion.card.*;

/**
 * Carte Espion (Spy)
 * 
 * +1 Carte.
 * +1 Action.
 * Tous les joueurs (vous aussi) dévoilent la première carte 
 * de leur deck. Vous décidez ensuite si chaque carte dévoilée 
 * est défaussée ou replacée sur son deck.
 */
public class Spy extends AttackCard {

	public Spy() {
		super("Spy", 4);
	}

	@Override
	public void play(Player p) {
		p.incrementActions(1); 	// +1 Actions
		p.drawCard();			// +1 Carte => pioche 1 carte
		
		// TODO : tous les joueurs (vous aussi) dévoilent la première carte 
		// de leur deck. Vous décidez ensuite si chaque carte dévoilée 
		// est défaussée ou replacée sur son deck.
			
	}
}