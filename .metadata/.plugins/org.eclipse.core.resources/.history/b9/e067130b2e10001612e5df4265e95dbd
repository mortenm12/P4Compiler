package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class If_Statement implements IASTNode {
	public Stats stats;
	public Linjer linjer;
	public Ellers_Statment ellers;
	@Override
	public String CodeGenration() {
		String s;
		s = stats.CodeGenration();
		s+= "ifne label1 \n";		//her er en label
		s+= linjer.CodeGenration();
		s+="label1 \n";				// her er en label
		s+= ellers.CodeGenration();
		return s;
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		stats.Semanticanalyse(s);
		scopeTree x = s.addScope("if"); //husk genereret nummer
		linjer.Semanticanalyse(x);
		ellers.Semanticanalyse(s);
		
	}

}
