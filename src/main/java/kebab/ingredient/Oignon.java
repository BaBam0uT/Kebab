package kebab.ingredient;

import visiteur.VisiteurRegime;

public class Oignon extends Ingredient {
	@Override
	public void accepter(VisiteurRegime visiteur) {
		visiteur.visiter(this);
	}
}
