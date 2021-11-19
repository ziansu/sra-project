private void tabIndent(int indent) {
    indent = indent * 4;
    for (int i = 0; i < indent; ++i) {
        out.print(" ");
    }
}