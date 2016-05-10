package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public interface IASTNode {
	public static class NumGen {
		private static int num=0;
		public static int getNum(){
			num +=1;
			return num;
		}
	}
	public String CodeGenration(scopeTree st) throws noIdException;
	public void Semanticanalyse(scopeTree s) throws existingVariableException,TypeException, noIdException;
	//public void TypeCheck() throws TypeException;
}
