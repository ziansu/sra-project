@java.lang.Override
public boolean checkSemantic(AST.SymbolTable table) {
    if (classId.equals(baseId))
        throw new java.lang.RuntimeException((("Cant extends from the same class : " + "class name : ") + (classId)));
    
    return fm_list.checkSemantic(table);
}