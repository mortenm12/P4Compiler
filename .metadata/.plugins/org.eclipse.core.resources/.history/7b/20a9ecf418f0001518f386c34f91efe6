package Variabler;

import java.util.List;


public class scopeTree {
	public String ScopeName;
	private List<scopeTree> Nodes;
	public HashSet HashTable;
	private scopeTree parent;
	
	
	public void add(String name){
		scopeTree x = new scopeTree();
		x.ScopeName = name;
		x.parent=this;
		
		Nodes.add(x);
	}
	
	public scopeTree searchScope(String name){
		if(name == this.ScopeName){
			return this;
		}
		else{
			for(scopeTree n : Nodes){
				scopeTree x = n.searchScope(name);
				if(x!=null)
					return x;
				
			}
			return null;
		}
	}
	
	public Var searchVar(String name)
	{
		if(HashTable.check(name))
			return HashTable.get(name);
		else if(parent != null)
			return parent.searchVar(name);
		else 
			return null;
			
	}
}
