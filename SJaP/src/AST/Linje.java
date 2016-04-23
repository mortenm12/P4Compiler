package AST;

public class Linje implements IASTNode {
	public IASTNode linjeIndhold;
	
	@Override
	public String CodeGenration() {

		return linjeIndhold.CodeGenration();
	}

}
