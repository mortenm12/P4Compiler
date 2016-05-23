package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class start implements IASTNode {
	public Linjer startLinjer;
	public Decl_Metoder slutMetoder;
	
	
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {
		String s ="public class start \n{\n public static void main(String args []) \n{\n";
		s+=startLinjer.CodeGenration(st);
		s+="}";
		if(slutMetoder != null)
			s+=slutMetoder.CodeGenration(st);
		
		s+="}";
		return s;
	}


	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		scopeTree x = s.addScope("start" +NumGen.getNum());//husk genereret nummer
		startLinjer.Semanticanalyse(x);
		if(slutMetoder != null)
			slutMetoder.Semanticanalyse(s);
		
	}

}
