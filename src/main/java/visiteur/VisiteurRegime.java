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

public interface VisiteurRegime {

	void visiter(Agneau agneau);
	void visiter(Crevette crevette);
	void visiter(Fromage fromage);
	void visiter(Oignon oignon);
	void visiter(Pain Pain);
	void visiter(Salade salade);
	void visiter(Sauce Sauce);
	void visiter(Thon thon);
	void visiter(Tomate tomate);
	void visiter(GaletteSarrasin galetteDeSarrasin);

}
