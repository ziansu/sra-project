public void addRule(org.xml.sax.Attributes attributes) {
    dataRule.put(attributes.getValue("name"), new com.filtering.element.Rule(ruleType, java.lang.Integer.parseInt(attributes.getValue("weight"))));
}