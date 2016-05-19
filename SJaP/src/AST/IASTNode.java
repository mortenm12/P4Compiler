package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public interface IASTNode {
	public static class NumGen {
		private static short num=0;
		public static short getNum(){
			num +=1;
			return num;
		}
	}
	public String CodeGenration(scopeTree st) throws noIdException;
	public void Semanticanalyse(scopeTree s) throws existingVariableException,TypeException, noIdException;
	
}
