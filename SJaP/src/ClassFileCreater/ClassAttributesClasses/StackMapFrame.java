package ClassFileCreater.ClassAttributesClasses;

import java.io.DataOutputStream;
import java.io.IOException;

import ClassFileCreater.ClassAttributesClasses.StackFrames.*;

public class StackMapFrame {
	
	String Identifier;
	AppendFrame TheAppendFrame;
	ChopFrame TheChopFrame;
	FullFrame TheFullFrame;
	SameFrame TheSameFrame;
	SameFrameExtended TheSameFrameExtended;
	SameLocalsOneStackItemFrame TheSameLocalsOneStackItemFrame;
	SameLocalsOneStackItemFrameExtended TheSameLocalsOneStackItemFrameExtended;
	VerificationTypeInfo TheVerificationTypeInfo;
	
	public void WriteFrame(DataOutputStream TheStream) throws IOException{
		switch(Identifier){
		case("AppendFrame"):
			TheStream.write((byte)TheAppendFrame.FrameType);
			TheStream.writeShort(TheAppendFrame.OffsetDelta);
			for(int i = 0; i < 3; i++)
				TheAppendFrame.Locals[i].WriteVerificationType(TheStream);
			break;
		case("ChopFrame"):
			TheStream.write((byte)TheChopFrame.FrameType);
			TheStream.writeShort((byte)TheChopFrame.OffsetDelta);
			break;
		case("FullFrame"):
			TheStream.write((byte)TheFullFrame.FrameType);
			TheStream.writeShort(TheFullFrame.OffsetDelta);
			TheStream.writeShort(TheFullFrame.NumberOfLocals);
			for(int i = 0; i < TheFullFrame.NumberOfLocals; i++)
				TheFullFrame.Locals[i].WriteVerificationType(TheStream);
			TheStream.writeShort(TheFullFrame.NumberOfStackItems);
			for(int i = 0; i < TheFullFrame.NumberOfStackItems; i++)
				TheFullFrame.Stack[i].WriteVerificationType(TheStream);
			break;
		case("SameFrame"):
			TheStream.write((byte)TheSameFrame.FrameType);
			break;
		case("SameFrameExtended"):
			TheStream.write((byte)TheSameFrameExtended.FrameType);
			TheStream.writeShort(TheSameFrameExtended.OffsetDelta);
			break;
		case("SameLocalsOneStackItemFrame"):
			TheStream.write((byte)TheSameLocalsOneStackItemFrame.FrameType);
			for(int i = 0; i < 1; i++)
				TheSameLocalsOneStackItemFrame.Stack[i].WriteVerificationType(TheStream);
			break;
		case("SameLocalsOneStackItemFrameExtended"):
			TheStream.write((byte)TheSameLocalsOneStackItemFrameExtended.FrameType);
			TheStream.writeShort(TheSameLocalsOneStackItemFrameExtended.OffsetDelta);
			for(int i = 0; i < 1; i++)
				TheSameLocalsOneStackItemFrameExtended.Stack[i].WriteVerificationType(TheStream);
		}
	}
}
