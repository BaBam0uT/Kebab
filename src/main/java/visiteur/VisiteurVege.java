package visiteur;

import kebab.ingredient.Agneau;
import kebab.ingredient.Crevette;
import kebab.ingredient.Fromage;
import kebab.ingredient.GaletteSarrasin;
import kebab.ingredient.Oignon;
import kebab.ingredient.Pain;
import kebab.ingredient.Salade;
import kebab.ingredient.Sauce;
import kebab.ingredient.Thon;
import kebab.ingredient.Tomate;

public class VisiteurVege implements VisiteurRegime {

	
	private boolean estVegetarien = true;

	public void visiter(Agneau agneau) {
		estVegetarien = false;
	}

	public void visiter(Crevette crevette) {
		estVegetarien = false;
	}

	public void visiter(Fromage fromage) {
		// est vegetarien
	}

	public void visiter(Oignon oignon) {
		// est vegetarien
	}

	public void visiter(Pain Pain) {
		// est vegetarien
	}

	public void visiter(Salade salade) {
		// est vegetarien
	}

	public void visiter(Sauce Sauce) {
		// est vegetarien
	}

	public void visiter(Thon thon) {
		estVegetarien = false;
	}

	public void visiter(Tomate tomate) {
		// est vegetarien
	}
	
	public boolean estVegetarien() {
		return this.estVegetarien;
	}

	public void visiter(GaletteSarrasin galetteDeSarrasin) {
		// est vegetarien
	}
}
