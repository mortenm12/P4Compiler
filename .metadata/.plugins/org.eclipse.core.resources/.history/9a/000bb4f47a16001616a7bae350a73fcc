package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Dcl_Metode implements IASTNode {
	public String ID;
	public Type ReturType;
	public ListOfDecl ListDcl;
	public Linjer lines;

	
	public String CodeGenration() {
		String s = ID;
		s+=lines.CodeGenration();
		if(ReturType == null){
			s+="return \n";
		}
		else if(ReturType._Type=="udsagn")
		{
			s+="breturn \n";
		}
		else if(ReturType._Type=="tal")
		{
			s+="dreturn \n";
		}
		else
		{
			s+="areturn \n";
		}
		
		return s;
		
	}


	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException, TypeException {
		s.addVar(ID, ReturType._Type);
		scopeTree x = s.addScope(ID);
		for(Dcl_Var o: ListDcl.Dcl_list){
			x.addVar(o.ID, o.GetType(s) );
		}
		lines.Semanticanalyse(x);
	}

}
