@java.lang.Override
public java.util.UUID classify(final com.github.jlgrock.snp.core.model.xml.lego.Expression expression) {
    com.github.jlgrock.snp.core.data.LegoLogicGraphBuilder legoLogicGraphBuilder = new com.github.jlgrock.snp.core.data.LegoLogicGraphBuilder(expression);
    gov.vha.isaac.logic.LogicGraph logicGraph = ((gov.vha.isaac.logic.LogicGraph) (legoLogicGraphBuilder));
    return java.util.UUID.randomUUID();
}