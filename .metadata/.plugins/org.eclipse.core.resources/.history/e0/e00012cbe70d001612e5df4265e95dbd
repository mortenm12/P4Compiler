package AST;

public class Stats implements IASTNode {
	public Stats node;
	public Stat stat1;
	
	
	@Override
	public String CodeGenration() {
		
		return stat1.CodeGenration() + node.CodeGenration();
	}
	
	public class and extends Stats{
		public Stat stat2;
		public String CodeGenration() {
			String s;
			s= stat2.CodeGenration();
			s+="iand";
			return s;
		}
	}
	public class or extends Stats{
		public Stat stat2;
		public String CodeGenration() {
			String s;
			s= stat2.CodeGenration();
			s+="ior";
			return s;
		}
	}

}
