package dominion.card.base;
import java.util.*;

import dominion.*;
import dominion.card.*;
import dominion.card.common.Copper;

/**
 * Carte Prêteur sur gages (Moneylender)
 * 
 * Écartez une carte Cuivre de votre main.
 * Dans ce cas, +3 Pièces.
 */
public class Moneylender extends ActionCard {

	public Moneylender(String name, int cost) {
		super(name, cost);
	}

	@Override
	public void play(Player p) {
		// Si le joueur à une carte Cuivre en main, l'écarte et gagne +3 Pièces
		for(Card c : p.getTreasureCards()) {
			if(c instanceof Copper) {
				p.ecarter(c);
				p.incrementMoney(3);
				break;
			}
		}
		// Sinon, ne fait rien
	}
}