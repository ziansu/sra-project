@java.lang.Override
public blue.nez.ast.Source subSource(long startIndex, long endIndex) {
    return new blue.nez.parser.StringSource(this.getResourceName(), this.linenum(startIndex), subByte(startIndex, endIndex), false);
}