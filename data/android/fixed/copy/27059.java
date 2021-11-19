protected static jkind.lustre.Node addSubNodeLustre(com.rockwellcollins.atc.agree.analysis.ast.AgreeNode agreeNode, java.lang.String nodePrefix, com.rockwellcollins.atc.agree.analysis.ast.AgreeNode flatNode, boolean monolithic) {
    jkind.lustre.Node lustreNode = com.rockwellcollins.atc.agree.analysis.LustreAstBuilder.getLustreNode(flatNode, nodePrefix, monolithic);
    com.rockwellcollins.atc.agree.analysis.LustreAstBuilder.addToNodes(lustreNode);
    return lustreNode;
}