package AST;
import Variabler.Var;
import Variabler.scopeTree;
public class Vars implements IASTNode {

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
			throw new Exception("Id'et " + ID + "fandtes ikke, husk og dekler en variable");
	}

	
	class var{
		Variabel Value;
	}
	
	class Get_By_Id{
		String ID;
	}
	
	class List_Index{
		String ID;
		Operation Index;
	}
	
	class Lenght_of_List{
		String ID;
	}
	
	class Sub_List{
		String ID;
		Operation From;
		Operation To;
	}
	
	class Meth{
		Metode method;
	}

}
