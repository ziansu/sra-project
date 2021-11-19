private com.tcdi.zombodb.query_parser.SpanQueryBuilder buildSpan(com.tcdi.zombodb.query_parser.ASTProximity prox, com.tcdi.zombodb.query_parser.ASTNull node) {
    return spanTermQuery(prox.getFieldname(), java.lang.String.valueOf(node.getValue()));
}