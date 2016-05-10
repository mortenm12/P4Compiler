package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Term implements IASTNode {
	public Term node;
	
	
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {

		return node.CodeGenration(st);
	}
	
	public String GetType(scopeTree s) throws noIdException{
		return node.GetType(s);
	}
	
	public class Mul extends Term{
		public Term term;
		public Vars op;
		
		public String CodeGenration(scopeTree st) throws noIdException {
			String s;
			s=op.CodeGenration(st);
			s+=term.CodeGenration(st);
			s+= "dmul";
			return s;
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			term.Semanticanalyse(s);
			op.Semanticanalyse(s);
			if(term.GetType(s)!= "tal"){
				throw new TypeException("Der skulle have været et tal");
			}
			else if (op.GetType(s)!="tal"){
				throw new TypeException("Der skulle have været et tal");
			}
		}
		
		public String GetType(scopeTree s) throws noIdException{
			return term.GetType(s);
		}
	}
	
	public class Div extends Term{
		public Term term;
		public Vars op;
		public String CodeGenration(scopeTree st) throws noIdException {
			String s;
			s=op.CodeGenration(st);
			s+=term.CodeGenration(st);
			s+= "ddiv";
			return s;
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			term.Semanticanalyse(s);
			op.Semanticanalyse(s);
			
			if(term.GetType(s)!= "tal"){
				throw new TypeException("Der skulle have været et tal");
			}
			else if (op.GetType(s)!="tal"){
				throw new TypeException("Der skulle have været et tal");
			}
		}
		
		public String GetType(scopeTree s) throws noIdException{
			return term.GetType(s);
		}
	}
	
	public class Mod extends Term{
		public Term term;
		public Vars op;
		public String CodeGenration(scopeTree st) throws noIdException {
			String s;
			s=op.CodeGenration(st);
			s+=term.CodeGenration(st);
			s+= "drem";
			return s;
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			term.Semanticanalyse(s);
			op.Semanticanalyse(s);
			
			if(term.GetType(s)!= "tal"){
				throw new TypeException("Der skulle have været et tal");
			}
			else if (op.GetType(s)!="tal"){
				throw new TypeException("Der skulle have været et tal");
			}
		}
		
		public String GetType(scopeTree s) throws noIdException{
			return term.GetType(s);
		}
	}
	
	public class paren extends Term{
		public Operation opera;
		public String CodeGenration(scopeTree st) throws noIdException {

			return opera.CodeGenration(st);
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			opera.Semanticanalyse(s);
		}
		
		public String GetType(scopeTree s) throws noIdException{
			return opera.term.GetType(s);
		}
	}
	
	public class vari extends Term{
		public Vars op;
		public String CodeGenration(scopeTree st) throws noIdException {

			return op.CodeGenration(st);
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			op.Semanticanalyse(s);
		}
		
		public String GetType(scopeTree s) throws noIdException{
			return op.GetType(s);
		}
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		node.Semanticanalyse(s);
		
	}

	

}
