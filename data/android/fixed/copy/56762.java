@java.lang.Override
public boolean equals(java.lang.Object otherFlow) {
    if (sameType(otherFlow)) {
        return bits.equals(((soot.toolkits.scalar.ArrayPackedSet<?>) (otherFlow)).bits);
    }else
        return super.equals(otherFlow);
    
}