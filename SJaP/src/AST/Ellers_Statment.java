package AST;

public class Ellers_Statment implements IASTNode {
	public Linjer linjer;
	public If_Statement if_stat;
	@Override
	public String CodeGenration() {

		if(linjer==null)
		{
			return if_stat.CodeGenration();
		}
		else
			return linjer.CodeGenration();

	}

}
