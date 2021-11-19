@java.lang.Override
public java.lang.Object Visit(codeGenerator.BoolNode node) {
    boolean b = node.aBoolean;
    if (b) {
        Targetcode.add("true");
    }else
        if (b) {
            Targetcode.add("false");
        }
    
    return null;
}