package AST;

import Exceptions.TypeException;
import Exceptions.existingVariableException;
import Exceptions.noIdException;
import Variabler.scopeTree;

public class For_Lokke implements IASTNode {
	
	public Operation from;
	public Operation to;
	public Linjer linjer;
	@Override
	public String CodeGenration() {
		String streng;
		int lab1=NumGen.getNum();
		int lab2=NumGen.getNum();
		
		streng = "new label"+lab1+" \n";			//nyt label magler
		streng += to.CodeGenration();
		streng += from.CodeGenration();
		streng += "dcmpl \n "
				+ "iflt  lable"+lab2+" \n";		//label ref magler
		streng += linjer.CodeGenration();
		streng += "goto lable"+lab1+" \n"; 		//label ref magler
		streng += "new label"+lab2+" \n";			//nyt label magler
		
		return streng;
	}
	@Override
	public void Semanticanalyse(scopeTree s) throws existingVariableException,
			noIdException, TypeException {
		from.Semanticanalyse(s);
		to.Semanticanalyse(s);
		scopeTree x = s.addScope("for"+NumGen.getNum()); //husk at tilføje et genereret tal
		linjer.Semanticanalyse(x);
		
	}
	

}
