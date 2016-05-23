package AST;

import java.util.LinkedList;
import java.util.List;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class ListOfVars implements IASTNode {
	public List<Operation> op;
	
	public ListOfVars(){
		op = new LinkedList<Operation>();
	}
	
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {
		String s ="";
		for(Operation o : op){
			s+=o.CodeGenration(st);
		}
		return s;
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		for(Operation o: op){
			o.Semanticanalyse(s);
		}
		
	}
	
	public String GetType(scopeTree s) throws noIdException{
		return op.get(0).term.GetType(s);
	}

}
