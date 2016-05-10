package AST;

import Exceptions.TypeException;
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
		noIdException, TypeException {
			operation.Semanticanalyse(s);
			
			if(term.GetType(s)=="udsagn" && operation.term.GetType(s)=="udsagn"){
				throw new TypeException("Man kan ikke ligge to udsagn sammen");
			}
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
		noIdException, TypeException {
			
			operation.Semanticanalyse(s);
			
			if(term.GetType(s)!= "tal"){
				throw new TypeException("Der skulle have været et tal");
			}
			else if (operation.term.GetType(s)!="tal"){
				throw new TypeException("Der skulle have været et tal");
			}
		}
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		term.Semanticanalyse(s);
		node.Semanticanalyse(s);
		
	}
}
