package AST;

import AST.IASTNode.NumGen;
import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.Var;
import Variabler.scopeTree;

public class Dcl_Var implements IASTNode {
	public Dcl_Var node;
	
	public String ID;
	public short intId;

	
	
	public String CodeGenration(scopeTree st) throws noIdException {
		
		return node.CodeGenration(st);
	}
	
	String GetType(scopeTree s) throws noIdException{
		return node.GetType(s);
	}
	
	public class Dcl extends Dcl_Var{
		public Type Type;
		public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException {
			intId=NumGen.getNum();
			s.addVar(ID, Type._Type, intId);
			
			
		}
		
		String GetType(scopeTree s){
			return Type._Type;
		}
		
		
		public String CodeGenration(scopeTree st) {
			switch (Type._Type){
			case "tal":
				return "dstore 0 " + intId + "\n" ;
			case "tekst":
				return "dstore 0 " + intId + "\n" ;
			case "udsagn":
				return "istore 0 " + intId + "\n" ;
			default:
				return null;
			}
			
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
		
		public String CodeGenration(scopeTree st) throws noIdException {
			String s=Value.CodeGenration(st);
			switch (st.searchVar(ID).type){
			case "tal":
				s+= "dstore "+ intId + "\n" ; break;
			case "tekst":
				s+= "astore "+ intId + "\n" ; break;
			case "udsagn":
				s+= "istore "+ intId + "\n" ; break;
			default:
				return "fejl";
			}
			return s;
			
		}
	}
	
	public class Dcl_Ass extends Dcl_Var{
		public Type Type;
		public Operation Value;
		public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException, TypeException {
			s.addVar(ID, Type._Type,NumGen.getNum());
			Value.Semanticanalyse(s);
			if(Type._Type != Value.term.GetType(s)){
				throw new TypeException("Typerne er ikke ens det skulle have været en " + Type._Type +"men det var en " + Value.term.GetType(s));
			}
		}
		String GetType(scopeTree s){
			return Type._Type;
		}
		
		public String CodeGenration(scopeTree st) throws noIdException {
			String s=Value.CodeGenration(st);
			switch (st.searchVar(ID).type){
			case "tal":
				s+= "dstore "+ intId + "\n" ; break;
			case "tekst":
				s+= "astore "+ intId + "\n" ; break;
			case "udsagn":
				s+= "istore "+ intId + "\n" ; break;
			default:
				return "fejl";
			}
			return s;
			
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
		
		public String CodeGenration(scopeTree st) throws noIdException {
			String s=Value.CodeGenration(st);
			switch (st.searchVar(ID).type){
			case "tal":
				s+= "dstore "+ intId + "\n" ; break;
			case "tekst":
				s+= "astore "+ intId + "\n" ; break;
			case "udsagn":
				s+= "istore "+ intId + "\n" ; break;
			case "liste" :
				s+= "astore "+ intId + "\n" ; break;
			default:
				return "fejl";
			}
			return s;	//indsætter ikke på index
			
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
		public String CodeGenration(scopeTree st) throws noIdException {
			String s=Value.CodeGenration(st);
			switch (st.searchVar(ID).type){
			case "tal":
				s+= "dstore "+ intId + "\n" ; break;
			case "tekst":
				s+= "astore "+ intId + "\n" ; break;
			case "udsagn":
				s+= "istore "+ intId + "\n" ; break;
			case "liste" :
				s+= "astore "+ intId + "\n" ; break;
			default:
				return "fejl";
			}
			return s;
			
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
		
		public String CodeGenration(scopeTree st) throws noIdException {
			String s="null";
			switch (st.searchVar(ID).type){
			case "tal":
				s+= "dstore "+ intId + "\n" ; break;
			case "tekst":
				s+= "astore "+ intId + "\n" ; break;
			case "udsagn":
				s+= "istore "+ intId + "\n" ; break;
			case "liste" :
				s+= "astore "+ intId + "\n" ; break;
			default:
				return "fejl";
			}
			return s; //sletter ikke variablen men sætter den til NULL
			
		}
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException, TypeException {
		
		node.Semanticanalyse(s);
	}

}
