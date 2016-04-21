package AST;

public class Stat implements IASTNode {
	public Stat node;
	@Override
	public String CodeGenration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public class opsop extends Stat{
		public Operation op1;
		public Operation op2;
		public Sammenlign operator;
	}
	
	public class par extends Stat{
		public Stats stats;
	}
	
	public class bool extends Stat{
		public Vars udsagn;
	}
	
	public class not extends Stat{
		public Stat stat;
	}
}
