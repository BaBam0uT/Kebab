package kebab.ingredient;

import visiteur.VisiteurRegime;

public class Crevette extends Ingredient {
	@Override
	public void accepter(VisiteurRegime visiteur) {
		visiteur.visiter(this);
	}
}
