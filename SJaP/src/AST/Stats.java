package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Stats implements IASTNode {
	public Stats node;
	public Stat stat1;
	
	
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {
		
		return stat1.CodeGenration(st) + node.CodeGenration(st);
	}
	
	public class and extends Stats{
		public Stat stat2;
		public String CodeGenration(scopeTree st) throws noIdException {
			return stat1.CodeGenration(st) + "&&" + stat2.CodeGenration(st);
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			stat2.Semanticanalyse(s);
		}
	}
	public class or extends Stats{
		public Stat stat2;
		public String CodeGenration(scopeTree st) throws noIdException {
			return stat1.CodeGenration(st) + "||" + stat2.CodeGenration(st);
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			stat2.Semanticanalyse(s);
		}
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		stat1.Semanticanalyse(s);
		node.Semanticanalyse(s);
		
	}

}
