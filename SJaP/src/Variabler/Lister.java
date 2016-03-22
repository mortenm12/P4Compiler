package Variabler;

import java.util.List;
import Exceptions.xyException;

public class Lister extends Var{
public List<Var> liste;

public void add(Var x){
	liste.add(x);
}

public Var get(int x){
	return liste.get(x);
}

public int getLenght()
{
	return liste.size();
}

public List<Var> getSubList(int x, int y) throws xyException
{
	if(y>x)
		throw new xyException("Y må ikke værre større end X.");
	else
	{
		return liste.subList(x, y);
	}
}

public void delete(int x){
	liste.remove(x);
}

}
