package kebab.ingredient;

import visiteur.VisiteurRegime;

public class Pain extends Ingredient {
	@Override
	public void accepter(VisiteurRegime visiteur) {
		visiteur.visiter(this);
	}
}
