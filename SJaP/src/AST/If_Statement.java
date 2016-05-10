package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class If_Statement implements IASTNode {
	public Stats stats;
	public Linjer linjer;
	public Ellers_Statment ellers;
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {
		String s;
		int lab1=NumGen.getNum();
		s = stats.CodeGenration(st);
		s+= "ifne label"+lab1+" \n";		//her er en label
		s+= linjer.CodeGenration(st);
		s+="label"+lab1+" \n";				// her er en label
		s+= ellers.CodeGenration(st);
		return s;
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		stats.Semanticanalyse(s);
		scopeTree x = s.addScope("if"+NumGen.getNum()); //husk genereret nummer
		linjer.Semanticanalyse(x);
		ellers.Semanticanalyse(s);
		
	}

}
