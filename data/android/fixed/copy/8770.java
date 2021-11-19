@java.lang.Override
public java.lang.String run() throws AbstractTclParser.TclParserError {
    java.lang.String result = java.lang.Double.toString(CalculateNode(parser.parse()));
    return result;
}