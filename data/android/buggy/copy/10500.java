@javax.annotation.Nonnull
public com.helger.jcodemodel.AbstractJClass narrow(@javax.annotation.Nonnull
final java.util.List<? extends com.helger.jcodemodel.AbstractJClass> clazz) {
    if (clazz.isEmpty())
        return this;
    
    return new com.helger.jcodemodel.JNarrowedClass(this, new java.util.ArrayList<com.helger.jcodemodel.AbstractJClass>(clazz));
}