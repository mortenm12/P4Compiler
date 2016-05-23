package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Sammenlign implements IASTNode {
public Sammenlign node;
	@Override
	public String CodeGenration(scopeTree st) {
		return node.CodeGenration(st);
		
	}
	

	public class bigger extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return "<";
		}
	}
	public class lesser extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return ">";
		}
	}
	public class biggerequal extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return "<=";
		}
	}
	public class lesserequal extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return ">=";
		}
	}
	public class equal extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return "==";
		}
	}
	public class notequal extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return "!=";
		}
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		//skal bare være tom
		
	}

}
