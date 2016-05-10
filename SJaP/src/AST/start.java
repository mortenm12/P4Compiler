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
	public String CodeGenration(scopeTree st) throws noIdException {
		String s ="start::";
		if(startMetoder != null)
				s+=startMetoder.CodeGenration(st);
		s+=startLinjer.CodeGenration(st);
		if(slutMetoder != null)
			s+=slutMetoder.CodeGenration(st);
		return s;
	}


	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		if(startMetoder != null)
			startMetoder.Semanticanalyse(s);
		scopeTree x = s.addScope("start" +NumGen.getNum());//husk genereret nummer
		startLinjer.Semanticanalyse(x);
		if(slutMetoder != null)
			slutMetoder.Semanticanalyse(s);
		
	}

}
