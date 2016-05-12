package ClassFileCreater;

public class ConstantPoolInfo {
	short Index;
	short NameTypeIndexOrDescriptorIndex;
	int HighBytes;
	int LowBytes;
	byte TheBytes[];
	byte ReferenceKind;
}
