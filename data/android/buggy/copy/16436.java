@java.lang.Override
public void setupProperties() {
    super.setupProperties();
    returns = org.talend.components.api.properties.ComponentPropertyFactory.newReturnsProperty();
    org.talend.components.api.properties.ComponentPropertyFactory.newReturnProperty(returns, Property.Type.INT, "NB_LINE");
    org.talend.components.salesforce.tsalesforceoutput.TSalesforceOutputProperties.setupUpsertRelation(upsertRelation, TSalesforceOutputProperties.POLY);
}