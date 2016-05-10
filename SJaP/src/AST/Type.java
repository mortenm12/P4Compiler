package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Type implements IASTNode {
	public String _Type;
	public Type NestedType;
	@Override
	public String CodeGenration(scopeTree st) {

		return "";
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		//den skal ikke gøre noget
		
	}
	

}
