package dominion.card.base;
import java.util.*;

import dominion.*;
import dominion.card.*;

/**
 * Carte Aventurier (Adventurer)
 * 
 * Dévoilez des cartes de votre deck jusqu'à ce que 2 
 * cartes Trésor soient dévoilées. Ajoutez ces cartes
 * Trésor à votre main et défaussez les autres cartes 
 * dévoilées.
 */
public class Adventurer extends ActionCard {

	public Adventurer(String name, int cost) {
		super(name, cost);
	}

	@Override
	public void play(Player p) {
		// TODO Auto-generated method stub
		p.incrementActions(-1);	// -1 Action pour l'utilisation de la carte
	}
}