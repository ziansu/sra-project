public static final lsf.zuba.vizobj.ChartParameter Visualization() throws lsf.zuba.javacc.ParseException {
    lsf.zuba.javacc.SyntaxChecker.jj_consume_token(8);
    lsf.zuba.javacc.SyntaxChecker.chart_definition();
    lsf.zuba.javacc.SyntaxChecker.jj_consume_token(0);
    return lsf.zuba.javacc.SyntaxChecker.chart_obj;
}