package AST;

import java.util.List;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Linjer implements IASTNode {
	public List<Linje> nyLinje;
	
	
	@Override
	public String CodeGenration() {
		String s ="";
		for(Linje l: nyLinje){
			s+=l.CodeGenration();
		}
		return s;
	}


	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		for(Linje l : nyLinje){
			l.Semanticanalyse(s);
		}
		
	}

}
