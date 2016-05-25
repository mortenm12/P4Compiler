package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Print implements IASTNode {
	public Operation op;
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {

		return "System.Out.Println("+op.CodeGenration(st)+")";
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			TypeException, noIdException {
		op.Semanticanalyse(s);

	}

}
