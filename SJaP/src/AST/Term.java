package AST;

import AST.Term.paren;

public class Term implements IASTNode {
	public Term node;
	
	
	@Override
	public String CodeGenration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public class Mul extends Term{
		public Term term;
		public Vars op;
	}
	
	public class Div extends Term{
		public Term term;
		public Vars op;
	}
	
	public class Mod extends Term{
		public Term term;
		public Vars op;
	}
	
	public class paren extends Term{
		public Operation opera;
	}
	
	public class vari extends Term{
		public Vars op;
	}
	

}
