@java.lang.Override
public java.lang.Object getItemObject(java.lang.Object parent, int pos, int depth) {
    if (parent == null)
        return object;
    else
        return ((de.wilson.wdtreelist.TestObject) (parent)).getChildren().get(pos);
    
}