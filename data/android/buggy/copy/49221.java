private void fields() {
    for (com.palantir.atlasdb.table.description.NameComponentDescription comp : desc.getRowParts()) {
        line("private final ", com.palantir.atlasdb.table.description.render.ComponentRenderers.typeName(comp), " ", com.palantir.atlasdb.table.description.render.ComponentRenderers.varName(comp), ";");
    }
}