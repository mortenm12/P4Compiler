package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class start implements IASTNode {
	public Decl_Metoder startMetoder;
	public Linjer startLinjer;
	public Decl_Metoder slutMetoder;
	
	
	@Override
	public String CodeGenration() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		startMetoder.Semanticanalyse(s);
		scopeTree x = s.addScope("start" +NumGen.getNum());//husk genereret nummer
		startLinjer.Semanticanalyse(x);
		slutMetoder.Semanticanalyse(s);
		
	}

}
