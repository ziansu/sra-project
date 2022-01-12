@java.lang.Override
public boolean canParse(java.lang.String type) {
    boolean exists = true;
    try {
        com.epam.page.object.generator.parser.CommonElementsRuleParser.CommonElementType.valueOf(type.toUpperCase());
    } catch (java.lang.IllegalArgumentException e) {
        exists = false;
    }
    return exists;
}