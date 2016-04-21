package AST;

public class For_Lokke implements IASTNode {
	
	Operation from;
	Operation to;
	Linjer linjer;
	@Override
	public String CodeGenration() {
		String streng;
		
		streng = "new label_1 \n";			//nyt label magler
		streng += to.CodeGenration();
		streng += from.CodeGenration();
		streng += "dcmpl \n "
				+ "iflt  lable_2 \n";		//label ref magler
		streng += linjer.CodeGenration();
		streng += "goto lable_1 \n"; 		//label ref magler
		streng += "new label_2 \n";			//nyt label magler
		
		return streng;
	}

}
