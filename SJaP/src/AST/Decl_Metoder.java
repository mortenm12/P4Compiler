package AST;

import java.util.LinkedList;
import java.util.List;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Decl_Metoder implements IASTNode {
	public List<Dcl_Metode> Metode;

	public Decl_Metoder(){
		Metode = new LinkedList<Dcl_Metode>();
	}
	
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {
		String s="";
		for(Dcl_Metode d: Metode){
			s+=d.CodeGenration(st);
		}
		return s;
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		for(Dcl_Metode m:Metode)
		{
			m.Semanticanalyse(s);
		}
		
	}

}
