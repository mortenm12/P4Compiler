package AST;

public class start implements IASTNode {
	public Decl_Metoder startMetoder;
	public Linjer startLinjer;
	public Decl_Metoder slutMetoder;
	
	
	@Override
	public String CodeGenration() {
		String string;
		
		string = "Allahu AKbar";	//somthing somthing diffrent
		string += startMetoder.CodeGenration();
		string += startLinjer.CodeGenration();
		string += slutMetoder.CodeGenration();
		
		return string;
	}

}
