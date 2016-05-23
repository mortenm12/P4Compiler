package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Ellers_Statment implements IASTNode {
	public Linjer linjer;
	public If_Statement if_stat;
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {

		if(linjer==null)
		{
			return if_stat.CodeGenration(st);
		}
		else
			return "else \n{\n" + linjer.CodeGenration(st) + "}\n";

	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		if(linjer==null){
			if_stat.Semanticanalyse(s);
		}
		else{
			scopeTree x = s.addScope("ellers"+ NumGen.getNum()); //husk et genereret tal
			linjer.Semanticanalyse(x);
		}
		
	}

}
