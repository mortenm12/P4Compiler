package ClassFileCreater.ClassAttributesClasses.StackFrames;

import java.io.DataOutputStream;
import java.io.IOException;

public class VerificationTypeInfo {

	String Identifier;
	
	short ObjectVariableCpoolIndex;
	
	short UninitializedVariableIndex;
	
	public void WriteVerificationType(DataOutputStream TheStream)throws IOException{
		switch(Identifier){
		case("TopVariableInfo"):
			TheStream.write(0);
			break;
		case("IntegerVariableInfo"):
			TheStream.write(1);
			break;
		case("FloatVariableInfo"):
			TheStream.write(2);
			break;
		case("LongVariableInfo"):
			TheStream.write(4);
			break;
		case("DoubleVariableInfo"):
			TheStream.write(3);
			break;
		case("NullVariableInfo"):
			TheStream.write(5);
			break;
		case("UnInitializedThisVariableTag"):
			TheStream.write(6);
			break;
		case("ObjectVariableTag"):
			TheStream.write(7);
			TheStream.writeShort(ObjectVariableCpoolIndex);
			break;
		case("UninitializedVariableTag"):
			TheStream.write(8);
			TheStream.writeShort(UninitializedVariableIndex);
			break;
		default:
			break;
		}
	}
}
