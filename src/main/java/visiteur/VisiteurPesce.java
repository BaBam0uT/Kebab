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

public class VisiteurPesce implements VisiteurRegime {

	private boolean estPescetarien = true;

	public void visiter(Agneau agneau) {
		estPescetarien = false;
	}

	public void visiter(Crevette crevette) {
		// est pescetarien
	}

	public void visiter(Fromage fromage) {
		// est pescetarien
	}

	public void visiter(Oignon oignon) {
		// est pescetarien
	}

	public void visiter(Pain Pain) {
		// est pescetarien
	}

	public void visiter(Salade salade) {
		// est pescetarien

	}

	public void visiter(Sauce Sauce) {
		// est pescetarien
	}

	public void visiter(Thon thon) {
		// est pescetarien
	}

	public void visiter(Tomate tomate) {
		// est pescetarien

	}

	public boolean estPescetarien() {
		return this.estPescetarien;
	}

	public void visiter(GaletteSarrasin galetteDeSarrasin) {
		// est pescetarien
	}


}
