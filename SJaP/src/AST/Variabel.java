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
	
	public String GetType(scopeTree s){
		return node.GetType(s);
	}
	
	public class Num{
		public double Value;
		public String CodeGenration() {

			return "dpush " + Value;
		}
		
		public String GetType(scopeTree s){
			return "num";
		}
	}
	public class Tekst{
		public String Value;
		public String CodeGenration() {

			return "aload "+ Value;
		}
		public String GetType(scopeTree s){
			return "tekst";
		}
	}
	public class Bool{
		public boolean Value;
		
		public String CodeGenration() {

			return "ipush " + Value;
		}
		
		public String GetType(scopeTree s){
			return "udsagn";
		}
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		//den skal ikke gøre noget
		
	}

}
