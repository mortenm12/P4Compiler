package AST;

import java.util.List;

public class Decl_Metoder implements IASTNode {
	public List<Dcl_Metode> Metode;

	@Override
	public String CodeGenration() {
		String s="";
		for(Dcl_Metode d: Metode){
			s+=d.CodeGenration();
		}
		return s;
	}

}
