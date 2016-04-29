package AST;
import Variabler.scopeTree;
import AST.Operation;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
public class Returner implements IASTNode {
	Operation op;
	
	public Returner(Operation o){
		op=o;
	}
	@Override
	public String CodeGenration() {

		return op.CodeGenration();
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		op.Semanticanalyse(s);
		
	}

}
