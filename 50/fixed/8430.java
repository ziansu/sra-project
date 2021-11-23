@java.lang.Override
public java.lang.Long convertFrom(org.structr.core.entity.AbstractNode node) {
    if (node == null)
        return null;
    
    return node.getId();
}