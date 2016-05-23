package AST;

import java.util.LinkedList;
import java.util.List;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class ListOfDecl implements IASTNode{

	public List<Dcl_Var> Dcl_list;
	
	public ListOfDecl(){
		Dcl_list = new LinkedList<Dcl_Var>();
	}
	
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {
		String s="";
		for(Dcl_Var d: Dcl_list)
		{
			s+=st.searchVar(d.ID).type + " " + d.ID +", ";
		}
		s=s.substring(0, s.length()-2);
		return s;
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			TypeException, noIdException {
		// TODO Auto-generated method stub
		
	}

}
