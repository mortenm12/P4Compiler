package ClassFileCreater.ClassAttributesClasses;

import ClassFileCreater.AttributesInfo;

public class CodeAttribute {
	
	public short MaxStack;
	public short MaxLocals;
	public int CodeLength;
	public byte TheCode[];
	public short ExceptionTableLength;
	public ExceptionContent ExceptionTable[];
	public short AttributesCount;
	public AttributesInfo TheAttributes[];
	
}
