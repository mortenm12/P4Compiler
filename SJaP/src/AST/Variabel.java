package AST;

import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Variabel implements IASTNode {
	public Variabel node;
	
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {

		return node.CodeGenration(st);
	}
	
	public String GetType(scopeTree s){
		return node.GetType(s);
	}
	
	public class Num extends Variabel{
		public double Value;
		public String CodeGenration(scopeTree st) {

			return ""+Value;
		}
		
		public String GetType(scopeTree s){
			return "num";
		}
	}
	public class Tekst extends Variabel{
		public String Value;
		public String CodeGenration(scopeTree st) {

			return Value;
		}
		public String GetType(scopeTree s){
			return "tekst";
		}
	}
	public class Bool extends Variabel{
		public boolean Value;
		
		public String CodeGenration(scopeTree st) {

			return "" + Value;
		}
		
		public String GetType(scopeTree s){
			return "udsagn";
		}
	}
	public class Input extends Variabel{

		public String CodeGenration(scopeTree st) throws noIdException {

			return "System.in.Read()";
		}
		
		public String GetType(scopeTree s){
			return "tekst";
		}
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException {
		//den skal ikke gøre noget
		
	}

}
