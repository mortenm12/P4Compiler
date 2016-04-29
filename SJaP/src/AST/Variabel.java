package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Variabel implements IASTNode {
	public Variabel node;
	
	@Override
	public String CodeGenration() {

		return node.CodeGenration();
	}
	
	public class Num{
		public double Value;
		public String CodeGenration() {

			return "dpush " + Value;
		}
	}
	public class Tekst{
		public String Value;
		public String CodeGenration() {

			return "aload "+ Value;
		}
	}
	public class Bool{
		public boolean Value;
		
		public String CodeGenration() {

			return "ipush " + Value;
		}
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		//den skal ikke gøre noget
		
	}

}
