package AST;
import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
//import Variabler.Var;
import Variabler.scopeTree;
public class Vars implements IASTNode {
	public Vars node;
	@Override
	public String CodeGenration(scopeTree st) throws noIdException {

		return node.CodeGenration(st);
	}
	
	public String GetType(scopeTree s) throws noIdException{
		return node.GetType(s);
	}
	
	public class var extends Vars{
		public Variabel Value;
		public String CodeGenration(scopeTree st) {

			return Value.CodeGenration(st);
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
		public String CodeGenration(scopeTree st) throws noIdException {
			switch(st.searchVar(ID).type){
			case "tal":
				return "dload "+ st.searchVar(ID).intId;
			
			case"tekst":
				return "aload "+ st.searchVar(ID).intId;
			
			case"udsagn":
				return "iload "+ st.searchVar(ID).intId;
			
			default:
				throw new noIdException("du burde ikek kunne være her.");
			}
						
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
		
		public String CodeGenration(scopeTree st) throws noIdException {
			String s="";
				switch (st.searchVar(ID).type){
				case "tal":
					s+= "dload "+ ID + "\n" ; break;
				case "tekst":
					s+= "aload "+ ID + "\n" ; break;
				case "udsagn":
					s+= "iload "+ ID + "\n" ; break;
				case "liste" :
					s+= "aload "+ ID + "\n" ; break;
				default:
					return "fejl";
				}
							
			return s;
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
		
		public String CodeGenration(scopeTree st) {
			String s="";//jeg aner ikke hvordan jeg skal finde længden af listen.
			return s;
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
		
		public String CodeGenration(scopeTree st) {

			return ""; //jeg aner ikke hvordan vi laver sub lister
		}
	}
	
	public class Meth extends Vars{
		public Metode method;
		public String CodeGenration(scopeTree st) throws noIdException {

			return method.CodeGenration(st);
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
