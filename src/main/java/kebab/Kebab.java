package kebab;

import java.util.List;

import kebab.ingredient.*;
import visiteur.VisiteurPesce;
import visiteur.VisiteurSansGluten;
import visiteur.VisiteurVege;

public class Kebab {
	
	private List<Ingredient> ingredients;
	
	public Kebab(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public List<Ingredient> listerLesIngredients() {
		return this.ingredients;
	}
	
	public boolean estVegetarien() {
		VisiteurVege visiteurVegetarien = new VisiteurVege();
		for (Ingredient ingredient : ingredients) {
			ingredient.accepter(visiteurVegetarien);
		}
		return visiteurVegetarien.estVegetarien();
	}

	public boolean estPescetarien() {
		VisiteurPesce visiteurPescetarien = new VisiteurPesce();
		for (Ingredient ingredient : ingredients) {
			ingredient.accepter(visiteurPescetarien);
		}
		return visiteurPescetarien.estPescetarien();
	}

	public boolean estSansGluten() {
		VisiteurSansGluten visiteurSansGluten = new VisiteurSansGluten();
		for (Ingredient ingredient : ingredients) {
			ingredient.accepter(visiteurSansGluten);
		}
		return visiteurSansGluten.estSansGluten();
	}

}
