package kebab.ingredient;

import visiteur.VisiteurRegime;

public class Tomate extends Ingredient {
	@Override
	public void accepter(VisiteurRegime visiteur) {
		visiteur.visiter(this);
	}
}
