package AST;

public class Dcl_Var implements IASTNode {
	public Dcl_Var node;
	
	public String ID;

	
	@Override
	public String CodeGenration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void SymbolTableCode() {
	}
	
	public class Dcl extends Dcl_Var{
		
		public Type Type;
	}
	
	public class Ass extends Dcl_Var{
		public Operation Value;
	}
	
	public class Dcl_Ass extends Dcl_Var{
		public Type Type;
		public Operation Value;
	}
	
	public class List_Ass extends Dcl_Var{
		public Operation Index;
		public Operation Value;
	}
	
	public class List_Add extends Dcl_Var{
		public Operation Value;
		
	}
	
	public class List_Del extends Dcl_Var{
		public Operation Index;
	}

}
