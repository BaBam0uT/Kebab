package kebab.ingredient;

import visiteur.VisiteurRegime;

public class Salade extends Ingredient {
	@Override
	public void accepter(VisiteurRegime visiteur) {
		visiteur.visiter(this);
	}
}
