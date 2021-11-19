@org.junit.Test
public void testFormulaNode() {
    assertEquals(FormulaType.EXPRESSION_FORMULA, FormulaNode.FormulaType.valueOf("EXPRESSION_FORMULA"));
    assertArrayEquals(new de.bmoth.parser.ast.nodes.FormulaNode.FormulaType[]{ FormulaType.EXPRESSION_FORMULA , FormulaType.PREDICATE_FORMULA }, de.bmoth.parser.ast.nodes.FormulaNode.FormulaType.values());
}