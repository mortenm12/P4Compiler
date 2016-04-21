package AST;

public class While_Lokke implements IASTNode {
	Stats stat;
	Linjer linjer;
	@Override
	public String CodeGenration() {
		String string;
		
		string = "new label_1 \n";		//label mangler
		string += stat.CodeGenration();
		string += "iflt  lable_2 \n";	//label ref mangler
		string += linjer.CodeGenration();
		string += "goto lable_1 \n";	//label ref mangler
		string += "new label_2";		//label mangler
		
		
		return string;
	}

}
