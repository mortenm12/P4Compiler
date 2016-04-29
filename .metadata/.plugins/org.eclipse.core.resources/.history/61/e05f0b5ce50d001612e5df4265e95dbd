package AST;

import java.util.List;

public class Linjer implements IASTNode {
	public List<Linje> nyLinje;
	
	
	@Override
	public String CodeGenration() {
		String s ="";
		for(Linje l: nyLinje){
			s+=l.CodeGenration();
		}
		return s;
	}

}
