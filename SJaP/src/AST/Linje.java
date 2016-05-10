package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Linje implements IASTNode {
	public IASTNode linjeIndhold;
	
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {

		return "linje"+linjeIndhold.CodeGenration(st);
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		linjeIndhold.Semanticanalyse(s);
		
	}

}
