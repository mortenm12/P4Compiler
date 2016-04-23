package AST;

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
	}
	
	public class par extends Stat{
		public Stats stats;
		
		public String CodeGenration() {

			return stats.CodeGenration();
		}
	}
	
	public class bool extends Stat{
		public Vars udsagn;
		public String CodeGenration() {

			return udsagn.CodeGenration();
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
	}
}
