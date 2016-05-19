package AST;

import AST.IASTNode.NumGen;
import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Dcl_Metode implements IASTNode {
	public String ID;
	public Type ReturType;
	public ListOfDecl ListDcl;
	public Linjer lines;
	public short intId;

	
	public String CodeGenration(scopeTree st) throws noIdException {
		String s = intId+"";
		s+=lines.CodeGenration(st);
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
		s.addVar(ID, ReturType._Type,NumGen.getNum());
		scopeTree x = s.addScope(ID);
		for(Dcl_Var o: ListDcl.Dcl_list){
			x.addVar(o.ID, o.GetType(s) ,NumGen.getNum());
		}
		lines.Semanticanalyse(x);
	}

}
