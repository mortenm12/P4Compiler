package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Metode implements IASTNode {
	
	public String ID;
	public ListOfVars ListVars;
	@Override
	public String CodeGenration() {
		String s;
		s= ListVars.CodeGenration();
		s+="goto "+ ID;
		
		return s;
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		s.searchVar(ID);
		ListVars.Semanticanalyse(s);
		
	}

}
