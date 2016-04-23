package AST;

public class Metode implements IASTNode {
	
	public String ID;
	public ListOfVars ListVars;
	@Override
	public String CodeGenration() {
		String s;
		s= ListVars.CodeGenration();
		s+="goto "+ ID;
		
		return s;
	}

}
