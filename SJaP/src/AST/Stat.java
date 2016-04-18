package AST;

public class Stat implements IASTNode {
	
	@Override
	public String CodeGenration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	class opsop{
		Operation op1;
		Operation op2;
		Sammenlign operator;
	}
	
	class par{
		Stats stats;
	}
	
	class bool{
		boolean udsagn;
	}
	
	class not{
		Stat stat;
	}
}
