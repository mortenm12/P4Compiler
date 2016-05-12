package ClassFileCreater;

import ClassFileCreater.ClassAttributesClasses.*;
import ClassFileCreater.ClassAttributesClasses.Deprecated;

public class AttributesInfo {
	String Identifier;

	short AttributeIndex;
	int AttributeLength;
	short ConstantValueIndex;
	
	CodeAttribute TheCodeAttribute;
	
	StackMapFrame StackMapFrameAttribute;
	
	ExceptionAttribute TheExceptionAttribute;
	
	InnerClasses InnerClassesAttribute;
	
	EnclosingMethod EnclosingMethodAttribute;
	
	Synthetic SyntheticAttribute;
	
	Signature SignatureAttribute;
	
	SourceFile SourceFileAttribute;
	
	SourceDebugExtension SourceDebugExtensionAttribute;
	
	LineNumberTable LineNumberTableAttribute;
	
	LocalVariableTableInfo LocalVariableTableAttribute;
	
	LocalVariableTypeInfo LocalVariableTypeTableAttribute;
	
	Deprecated DeprecatedAttribute;
	
	RunTimeVisibleAnnotation RunTimeVisibleAnnotationAttribute;
	
	ElementValue ElementValueAttribute; //unsure if this one should be here
	
	RunTimeInvisibleAnnotations RunTimeInvisibleAnnotationAttribute;
	
	RunTimeVisibleParameterAnnotations RunTimeVisibleParameterAnnotationAttribute;
	
	RunTimeInvisibleParameterAnnotation RunTimeInvisibleParameterAnnotationAttribute;
	
	AnnotationDefault AnnotationDefaultAttribute;
	
	BootStrapMethods BootStrapMethodAttribute;
}
