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

public class VisiteurSansGluten implements VisiteurRegime {
	
	private boolean estSansGluten = true;

	public void visiter(Agneau agneau) {
		// est sans gluten
	}

	public void visiter(Crevette crevette) {
		// est sans gluten
	}

	public void visiter(Fromage fromage) {
		// est sans gluten
	}

	public void visiter(Oignon oignon) {
		// est sans gluten
	}

	public void visiter(Pain Pain) {
		estSansGluten = false;

	}

	public void visiter(Salade salade) {
		// TODO Auto-generated method stub

	}

	public void visiter(Sauce Sauce) {
		// est sans gluten
	}

	public void visiter(Thon thon) {
		// est sans gluten
	}

	public void visiter(Tomate tomate) {
		// est sans gluten
	}

	public void visiter(GaletteSarrasin galetteDeSarrasin) {
		// est sans gluten
	}

	public boolean estSansGluten() {
		return this.estSansGluten;
	}

}
