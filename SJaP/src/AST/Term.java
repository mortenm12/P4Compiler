package AST;

public class Term implements IASTNode {
	public Term node;
	
	
	@Override
	public String CodeGenration() {

		return node.CodeGenration();
	}
	
	public class Mul extends Term{
		public Term term;
		public Vars op;
		
		public String CodeGenration() {
			String s;
			s=op.CodeGenration();
			s+=term.CodeGenration();
			s+= "dmul";
			return s;
		}
	}
	
	public class Div extends Term{
		public Term term;
		public Vars op;
		public String CodeGenration() {
			String s;
			s=op.CodeGenration();
			s+=term.CodeGenration();
			s+= "ddiv";
			return s;
		}
	}
	
	public class Mod extends Term{
		public Term term;
		public Vars op;
		public String CodeGenration() {
			String s;
			s=op.CodeGenration();
			s+=term.CodeGenration();
			s+= "drem";
			return s;
		}
	}
	
	public class paren extends Term{
		public Operation opera;
		public String CodeGenration() {

			return opera.CodeGenration();
		}
	}
	
	public class vari extends Term{
		public Vars op;
		public String CodeGenration() {

			return op.CodeGenration();
		}
	}
	

}
