package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;


public class Operation implements IASTNode {
	public Operation node;
	public Term term;
	public Operation operation;
	
	@Override
	public String CodeGenration() {
		
		return node.CodeGenration();
	}
	
	public class Add extends Operation{
		public String CodeGenration() {
			String s;
			s=term.CodeGenration();
			s+= operation.CodeGenration();
			return s;
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException {
			operation.Semanticanalyse(s);
		}
	}
	
	public class Sub extends Operation{
		public String CodeGenration() {
			String s;
			s=term.CodeGenration();
			s+= operation.CodeGenration();
			return s;
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException {
			
			operation.Semanticanalyse(s);
		}
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		term.Semanticanalyse(s);
		node.Semanticanalyse(s);
		
	}
}
