package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Stat implements IASTNode {
	public Stat node;
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {

		return node.CodeGenration(st);
	}
	
	public class opsop extends Stat{
		public Operation op1;
		public Operation op2;
		public Sammenlign operator;
		
		public String CodeGenration(scopeTree st) throws noIdException {
			String s;
			s=op1.CodeGenration(st);
			s+= operator.CodeGenration(st);
			s+=op2.CodeGenration(st);
			return s;
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			op1.Semanticanalyse(s);
			op2.Semanticanalyse(s);
			operator.Semanticanalyse(s);
		}
	}
	
	public class par extends Stat{
		public Stats stats;
		
		public String CodeGenration(scopeTree st) throws noIdException {

			return "("+stats.CodeGenration(st)+")";
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			stats.Semanticanalyse(s);
		}
	}
	
	public class bool extends Stat{
		public Vars udsagn;
		public String CodeGenration(scopeTree st) throws noIdException {

			return udsagn.CodeGenration(st);
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			udsagn.Semanticanalyse(s);
		}
	}
	
	public class not extends Stat{
		public Stat stat;
		public String CodeGenration(scopeTree st) throws noIdException {
			return "!" + stat.CodeGenration(st);
		}
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			stat.Semanticanalyse(s);
		}
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		node.Semanticanalyse(s);
		
	}
}
