@java.lang.Override
public org.eclipse.imp.pdb.facts.type.Type getConstructorType() {
    return org.eclipse.imp.pdb.facts.type.TypeFactory.getInstance().constructor(new org.eclipse.imp.pdb.facts.type.TypeStore(), getType(), getName(), new org.eclipse.imp.pdb.facts.type.Type[0]);
}