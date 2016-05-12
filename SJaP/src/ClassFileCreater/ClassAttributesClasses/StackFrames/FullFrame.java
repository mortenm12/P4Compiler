package ClassFileCreater.ClassAttributesClasses.StackFrames;

public class FullFrame {

	public short FrameType = 255;
	public short OffsetDelta;
	public short NumberOfLocals;
	public VerificationTypeInfo[] Locals;
	public short NumberOfStackItems;
	public VerificationTypeInfo[] Stack;
	
	
	public FullFrame(short TheOffsetDelta, short TheNumberOfLocals, short TheNumberOfStackItems){
		OffsetDelta = TheOffsetDelta;
		NumberOfLocals = TheNumberOfLocals;
		Locals = new VerificationTypeInfo[NumberOfLocals];
		NumberOfStackItems = TheNumberOfStackItems;
		Stack = new VerificationTypeInfo[NumberOfStackItems];
	}

}
