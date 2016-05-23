package AST;
import Variabler.scopeTree;
import AST.Operation;
import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
public class Returner implements IASTNode {
	Operation op;
	
	public Returner(Operation o){
		op=o;
	}
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {

		return op.CodeGenration(st);		//der mangler en ret
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		op.Semanticanalyse(s);
		
		//if(op.term.GetType(s)!=typen fra metoden)
		
	}

}
