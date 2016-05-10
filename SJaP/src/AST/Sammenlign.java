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
			return "ifgt \n";
		}
	}
	public class lesser extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return "iflt \n";
		}
	}
	public class biggerequal extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return "ifge \n";
		}
	}
	public class lesserequal extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return "ifle \n";
		}
	}
	public class equal extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return "ifeq \n";
		}
	}
	public class notequal extends Sammenlign{
		public String CodeGenration(scopeTree st){
			return "ifne \n";
		}
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		//skal bare være tom
		
	}

}
