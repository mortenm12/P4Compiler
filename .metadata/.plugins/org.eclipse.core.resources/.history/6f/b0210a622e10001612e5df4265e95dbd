package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class While_Lokke implements IASTNode {
	public Stats stat;
	public Linjer linjer;
	@Override
	public String CodeGenration() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		stat.Semanticanalyse(s);
		scopeTree x = s.addScope("while"); //husk genereret nummer
		linjer.Semanticanalyse(x);
		
	}

}
