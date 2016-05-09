package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class Stat implements IASTNode {
	public Stat node;
	@Override
	public String CodeGenration() {

		return node.CodeGenration();
	}
	
	public class opsop extends Stat{
		public Operation op1;
		public Operation op2;
		public Sammenlign operator;
		
		public String CodeGenration() {
			String s;
			s=op1.CodeGenration();
			s+=op2.CodeGenration();
			s+= operator.CodeGenration();
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
		
		public String CodeGenration() {

			return stats.CodeGenration();
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			stats.Semanticanalyse(s);
		}
	}
	
	public class bool extends Stat{
		public Vars udsagn;
		public String CodeGenration() {

			return udsagn.CodeGenration();
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			udsagn.Semanticanalyse(s);
		}
	}
	
	public class not extends Stat{
		public Stat stat;
		public String CodeGenration() {
			String s;
			s= stat.CodeGenration();
			s+="ineg";
			return s;
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
