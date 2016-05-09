package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.Var;
import Variabler.scopeTree;

public class Dcl_Var implements IASTNode {
	public Dcl_Var node;
	
	public String ID;

	
	@Override
	public String CodeGenration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	String GetType(scopeTree s) throws noIdException{
		return node.GetType(s);
	}
	
	public class Dcl extends Dcl_Var{
		public Type Type;
		public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException {
			s.addVar(ID, Type._Type);
			
		}
		
		String GetType(scopeTree s){
			return Type._Type;
		}
	}
	
	public class Ass extends Dcl_Var{
		public Operation Value;
		public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException, TypeException {
			Var v = s.searchVar(ID);
			if (v.type!=Value.term.GetType(s)){
				throw new TypeException("Typerne er ikke ens det skulle have været en " + v.type +"men det var en " + Value.term.GetType(s));
			}
			
		}
		
		String GetType(scopeTree s) throws noIdException{
			return s.searchVar(ID).type;
		}
	}
	
	public class Dcl_Ass extends Dcl_Var{
		public Type Type;
		public Operation Value;
		public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException, TypeException {
			s.addVar(ID, Type._Type);
			Value.Semanticanalyse(s);
			if(Type._Type != Value.term.GetType(s)){
				throw new TypeException("Typerne er ikke ens det skulle have været en " + Type._Type +"men det var en " + Value.term.GetType(s));
			}
		}
		String GetType(scopeTree s){
			return Type._Type;
		}
	}
	
	public class List_Ass extends Dcl_Var{
		public ListOfVars Index;
		public Operation Value;
		public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException, TypeException {
			s.searchVar(ID);
			Value.Semanticanalyse(s);
			Index.Semanticanalyse(s);
			if(Index.GetType(s) !="tal"){
				throw new TypeException("Det var ikke et tal men et "+ Index.GetType(s));
			}
			else if (Value.term.GetType(s) != s.searchVar(ID).type){
				throw new TypeException("Typerne er ikke ens, den forventede type " + s.searchVar(ID).type);
			}
		}
		
		String GetType(scopeTree s) throws noIdException{
			return s.searchVar(ID).type;
		}
	}
	
	public class List_Add extends Dcl_Var{
		public Operation Value;
		public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException, TypeException {
			s.searchVar(ID);
			Value.Semanticanalyse(s);
			
			if(Value.term.GetType(s) != s.searchVar(ID).type){
				throw new TypeException("Der forventes typen " + s.searchVar(ID).type);
			}
			
		}
		String GetType(scopeTree s) throws noIdException{
			return s.searchVar(ID).type;
		}
	}
	
	public class List_Del extends Dcl_Var{
		public ListOfVars Index;
		public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException, TypeException {
			s.searchVar(ID);
			Index.Semanticanalyse(s);
			
			if(Index.GetType(s) != "tal")
			{
				throw new TypeException("Der forventes et tal men der var et " + Index.GetType(s));
			}
		}
		
		String GetType(scopeTree s) throws noIdException{
			return s.searchVar(ID).type;
		}
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException, TypeException {
		
		node.Semanticanalyse(s);
	}

}
