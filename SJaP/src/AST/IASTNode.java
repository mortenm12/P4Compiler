package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public interface IASTNode {
	public String CodeGenration();
	public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException;

}
