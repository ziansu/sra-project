public tudresden.ocl20.parser.astgen.StringLiteralExp computeAstFor_AStringLiteralExpCs(tudresden.ocl20.parser.astgen.StringLiteralExp myAst, tudresden.ocl20.parser.astgen.Heritage nodeHrtgCopy, java.lang.String astValue) throws tudresden.ocl20.parser.astgen.AttrEvalException {
    myAst.setStringSymbol(astValue.substring(1, ((astValue.length()) - 2)));
    return myAst;
}