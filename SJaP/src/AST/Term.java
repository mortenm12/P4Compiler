package AST;

public class Term implements IASTNode {
	Vars var;
	Term op;
	
	@Override
	public String CodeGenration() {
		// TODO Auto-generated method stub
		return null;
	}
	
	class Mul{
		Term term;
	}
	
	class Div{
		Term term;
	}
	
	class Mod{
		Term term;
	}
	
	class paren{
		Operation opera;
	}

}
