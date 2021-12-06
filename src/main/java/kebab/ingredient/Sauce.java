package kebab.ingredient;

import visiteur.VisiteurRegime;

public class Sauce extends Ingredient {
	@Override
	public void accepter(VisiteurRegime visiteur) {
		visiteur.visiter(this);
	}
}
