package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Metode implements IASTNode {
	
	public String ID;
	public ListOfVars ListVars;
	@Override
	public String CodeGenration() {
		String s;
		s= ListVars.CodeGenration();
		s+="goto "+ ID;
		
		return s;
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		s.searchVar(ID);
		ListVars.Semanticanalyse(s);
		for(int i =0; i<ListVars.op.size();i++){

			if(ListVars.op.get(i).term.GetType(s)!=s.searchScope(ID).TypeList.get(i)){
				throw new TypeException("Typerne skal være ens");
			}
		}
	}
	
	public String GetType(scopeTree s) throws noIdException{
		return s.searchVar(ID).type;
	}

}
