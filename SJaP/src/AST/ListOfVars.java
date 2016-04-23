package AST;

import java.util.List;

public class ListOfVars implements IASTNode {
	public List<Operation> op;
	
	@Override
	public String CodeGenration() {
		String s ="";
		for(Operation o : op){
			s+=o.CodeGenration();
		}
		return s;
	}

}
