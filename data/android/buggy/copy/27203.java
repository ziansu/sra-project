@java.lang.Override
public vct.antlr4.parser.OMPelement visitOmp_for(vct.antlr4.parser.Omp_forContext ctx) {
    return new vct.antlr4.parser.OMPpragma(vct.antlr4.parser.OMPoption.Kind.For, map(ctx));
}