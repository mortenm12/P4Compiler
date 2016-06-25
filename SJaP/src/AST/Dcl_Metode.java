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
		String s = "public ";
		
		
		if(ReturType == null){
			s+="void ";
		}
		else if(ReturType._Type=="udsagn")
		{
			s+="boolian ";
		}
		else if(ReturType._Type=="tal")
		{
			s+="double  ";
		}
		else if(ReturType._Type=="tekst")
		{
			s+="String ";
		}
		else if(ReturType._Type=="liste af")
		{
			s+="List<> ";	//der vil ske en fejl på <>
		}		
		s+=ID +"(" + ListDcl +")\n {";		
		s+=lines.CodeGenration(st);
		s+="}";
		return s;
		
	}


	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException, noIdException, TypeException {
		s.addVar(ID, ReturType._Type);
		scopeTree x = s.addScope(ID);
		for(Dcl_Var o: ListDcl.Dcl_list){
			x.addVar(o.ID, o.GetType(s));
		}
		lines.Semanticanalyse(x);
	}

}
