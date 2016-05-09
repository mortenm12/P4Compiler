package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Linje implements IASTNode {
	public IASTNode linjeIndhold;
	
	@Override
	public String CodeGenration() {

		return linjeIndhold.CodeGenration();
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		linjeIndhold.Semanticanalyse(s);
		
	}

}
