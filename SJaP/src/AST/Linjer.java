package AST;

import java.util.LinkedList;
import java.util.List;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Linjer implements IASTNode {
	public List<Linje> nyLinje;
	
	public Linjer(){
		nyLinje =  new LinkedList<Linje>();
	}
	
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
			noIdException, TypeException {
		for(Linje l : nyLinje){
			l.Semanticanalyse(s);
		}
		
	}

}
