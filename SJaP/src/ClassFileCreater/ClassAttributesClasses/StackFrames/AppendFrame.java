package ClassFileCreater.ClassAttributesClasses.StackFrames;

public class AppendFrame {

	public short FrameType = 254;
	public short OffsetDelta;
	public VerificationTypeInfo[] Locals = new VerificationTypeInfo[FrameType - 251];
	//TODO: figure out if the size of Locals is correct
}
