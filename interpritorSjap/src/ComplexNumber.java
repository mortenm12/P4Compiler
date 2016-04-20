
public class ComplexNumber {
	double a;
	double b;
	
	public ComplexNumber add(ComplexNumber x){
		ComplexNumber t = new ComplexNumber();
		t.a=this.a+x.a;
		t.b=this.b+x.b;
		return t;
	}
	
	public ComplexNumber sub(ComplexNumber x){
		ComplexNumber t = new ComplexNumber();
		t.a=this.a-x.a;
		t.b=this.b-x.b;
		return t;
	}
	
	public ComplexNumber mul(ComplexNumber x){
		ComplexNumber t = new ComplexNumber();
		t.a=this.a*x.a-this.b*x.b;
		t.b=this.a*x.b+this.b*x.a;
		return t;
	}
	
	public ComplexNumber div(ComplexNumber x){
		ComplexNumber t = new ComplexNumber();
		t.a=(this.a*x.a + this.b*x.b)/(Math.pow(x.a,2)+Math.pow(x.b,2));
		t.b=(this.b*x.a-this.a*x.b)/(Math.pow(x.a,2)+Math.pow(x.b,2));
		return t;
	}
}
