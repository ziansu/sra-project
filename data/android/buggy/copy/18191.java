@java.lang.Override
public java.lang.Object load(org.nlogo.api.PrimitiveManager primitiveManager) {
    primitiveManager.addPrimitive("breeds", new NetLogoReflection.Breeds());
    primitiveManager.addPrimitive("globals", new NetLogoReflection.Globals());
    primitiveManager.addPrimitive("procedures", new NetLogoReflection.Procedures());
    return null;
}