package AST;
import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
//import Variabler.Var;
import Variabler.scopeTree;
public class Vars implements IASTNode {
	public Vars node;
	@Override
	public String CodeGenration() {

		return node.CodeGenration();
	}
	
	public String GetType(scopeTree s) throws noIdException{
		return node.GetType(s);
	}
	
	public class var extends Vars{
		public Variabel Value;
		public String CodeGenration() {

			return Value.CodeGenration();
		}
				
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException {
			Value.Semanticanalyse(s);
		}
		
		public String GetType(scopeTree s){
			return Value.GetType(s);
		}
	}
	
	public class Get_By_Id extends Vars{
		public String ID;
		public String CodeGenration() {

			return "";			//slå op i symbol tabellen over hvilken type det er.
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException {
			s.searchVar(ID);
		}
		
		public String GetType(scopeTree s) throws noIdException{
			return s.searchVar(ID).type;
		}
	}
	
	public class List_Index extends Vars{
		public String ID;
		public ListOfVars Index;
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			s.searchVar(ID);
			Index.Semanticanalyse(s);
			if(Index.GetType(s)!="tal"){
				throw new TypeException("Der forventes en type tal");
			}
		}
		
		public String GetType(scopeTree s) throws noIdException{
			return s.searchVar(ID).type;
		}
	}
	
	public class Lenght_of_List extends Vars{
		public String ID;
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException {
			s.searchVar(ID);
		}
		public String GetType(scopeTree s) throws noIdException{
			return "tal";
		}
	}
	
	public class Sub_List extends Vars{
		public String ID;
		public Operation From;
		public Operation To;
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			s.searchVar(ID);
			From.Semanticanalyse(s);
			To.Semanticanalyse(s);
		}
		
		public String GetType(scopeTree s) throws noIdException{
			return s.searchVar(ID).type;
		}
	}
	
	public class Meth extends Vars{
		public Metode method;
		public String CodeGenration() {

			return method.CodeGenration();
		}
		
		public void Semanticanalyse(scopeTree s) throws existingVariableException,
		noIdException, TypeException {
			method.Semanticanalyse(s);
		}
		
		public String GetType(scopeTree s) throws noIdException{
			return method.GetType(s);
		}
	}

	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		node.Semanticanalyse(s);
		
	}

}
