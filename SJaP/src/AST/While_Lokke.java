package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class While_Lokke implements IASTNode {
	public Stats stat;
	public Linjer linjer;
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {
		return "while(" + stat.CodeGenration(st) + ") \n{\n" + linjer.CodeGenration(st) + "}";

	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		stat.Semanticanalyse(s);
		scopeTree x = s.addScope("while"+NumGen.getNum()); //husk genereret nummer
		linjer.Semanticanalyse(x);
		
	}

}
