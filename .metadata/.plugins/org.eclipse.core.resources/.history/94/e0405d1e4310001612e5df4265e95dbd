package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Term implements IASTNode {
	public Term node;
	
	
	@Override
	public String CodeGenration() {

		return node.CodeGenration();
	}
	
	public class Mul extends Term{
		public Term term;
		public Vars op;
		
		public String CodeGenration() {
			String s;
			s=op.CodeGenration();
			s+=term.CodeGenration();
			s+= "dmul";
			return s;
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException {
			term.Semanticanalyse(s);
			op.Semanticanalyse(s);
		}
	}
	
	public class Div extends Term{
		public Term term;
		public Vars op;
		public String CodeGenration() {
			String s;
			s=op.CodeGenration();
			s+=term.CodeGenration();
			s+= "ddiv";
			return s;
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException {
			term.Semanticanalyse(s);
			op.Semanticanalyse(s);
		}
	}
	
	public class Mod extends Term{
		public Term term;
		public Vars op;
		public String CodeGenration() {
			String s;
			s=op.CodeGenration();
			s+=term.CodeGenration();
			s+= "drem";
			return s;
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException {
			term.Semanticanalyse(s);
			op.Semanticanalyse(s);
		}
	}
	
	public class paren extends Term{
		public Operation opera;
		public String CodeGenration() {

			return opera.CodeGenration();
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException {
			opera.Semanticanalyse(s);
		}
	}
	
	public class vari extends Term{
		public Vars op;
		public String CodeGenration() {

			return op.CodeGenration();
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException {
			op.Semanticanalyse(s);
		}
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		node.Semanticanalyse(s);
		
	}
	

}
