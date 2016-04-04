
public class inter {
	public static void main(String[] args){
		String Id="";
		int tal=0;

		for(int i =0; i<args.length; i++){
			if(args[i].contains("som")){
				Id=args[i-1];
			}
			else if(args[i].contains("=")){
				tal=Integer.parseInt(args[i+1]);
			}
		}
		System.out.print("int "+ Id + " = " + tal+";");
		
		
	}
}
