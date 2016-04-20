package AST;
import Variabler.Var;
import Variabler.scopeTree;
public class Vars implements IASTNode {
	public Vars node;
	@Override
	public String CodeGenration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Var GetVarFromScopetree (String ID, scopeTree tree) throws Exception{
		Var x= tree.searchVar(ID);
		if (x!=null)
			return x;
		else
			throw new Exception("Id'et " + ID + "fandtes ikke, husk og deklerer en variable");
	}


	public class var extends Vars{
		public Variabel Value;
	}
	
	public class Get_By_Id extends Vars{
		public String ID;
	}
	
	public class List_Index extends Vars{
		public String ID;
		public Operation Index;
	}
	
	public class Lenght_of_List extends Vars{
		public String ID;
	}
	
	public class Sub_List extends Vars{
		public String ID;
		public Operation From;
		public Operation To;
	}
	
	public class Meth extends Vars{
		public Metode method;
	}

}
