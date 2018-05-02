package dominion.card.base;

import dominion.*;
import dominion.card.*;

/**
 * Carte Douves (Moat)
 * 
 * +2 Cartes.
 * Lorsqu’un adversaire joue une carte Attaque, vous 
 * pouvez dévoiler cette carte de votre main. Dans ce cas, 
 * l’Attaque n’a pas d’effet sur vous.
 */
public class Moat extends ReactionCard {

	public Moat() {
		// Construction de la carte avec ses caractérisques
		super("Moat", 2);
	}

	@Override
	public void play(Player p) {
		// +2 Carte = pioche 2 carte
		for (int i = 0; i < 2; i++) {
			p.drawToHand();
		}
	}
}