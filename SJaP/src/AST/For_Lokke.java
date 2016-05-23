package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class For_Lokke implements IASTNode {
	
	public Operation from;
	public Operation to;
	public Linjer linjer;
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {
		
		
		return "for(int i = " + from.CodeGenration(st) + "; i < "
				+ to.CodeGenration(st) + "; i++)\n{\n" 
				+ linjer.CodeGenration(st)+"}\n";
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		from.Semanticanalyse(s);
		to.Semanticanalyse(s);
		scopeTree x = s.addScope("for"+NumGen.getNum()); //husk at tilføje et genereret tal
		linjer.Semanticanalyse(x);
		
	}
	

}
