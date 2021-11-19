protected static java.lang.String getBNpos_en(java.util.Map<java.lang.String, it.uniroma1.lcl.babelnet.data.BabelPOS> posMapping, java.lang.String pos) {
    it.uniroma1.lcl.babelnet.data.BabelPOS bnPos = posMapping.get(pos);
    if (bnPos == null) {
        return null;
    }else {
        return bnPos.toString();
    }
}