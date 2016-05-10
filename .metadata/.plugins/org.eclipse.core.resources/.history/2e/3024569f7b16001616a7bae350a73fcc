package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Sammenlign implements IASTNode {
public Sammenlign node;
	@Override
	public String CodeGenration() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public class bigger extends Sammenlign{
		public String CodeGenration(){
			return "ifgt \n";
		}
	}
	public class lesser extends Sammenlign{
		public String CodeGenration(){
			return "iflt \n";
		}
	}
	public class biggerequal extends Sammenlign{
		public String CodeGenration(){
			return "ifge \n";
		}
	}
	public class lesserequal extends Sammenlign{
		public String CodeGenration(){
			return "ifle \n";
		}
	}
	public class equal extends Sammenlign{
		public String CodeGenration(){
			return "ifeq \n";
		}
	}
	public class notequal extends Sammenlign{
		public String CodeGenration(){
			return "ifne \n";
		}
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		//skal bare være tom
		
	}

}
