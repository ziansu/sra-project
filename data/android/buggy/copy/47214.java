@java.lang.Override
public void enterGroupElseBlock(org.wso2.carbon.ibus.mediation.cheetah.config.dsl.external.wuml.generated.WUMLParser.GroupElseBlockContext ctx) {
    org.wso2.carbon.ibus.mediation.cheetah.config.dsl.external.wuml.WUMLBaseListenerImpl.log.info("enterGroupElseBlock:");
    transactionMultiThenBlockStarted = false;
    transactionElseBlockStarted = true;
    super.enterGroupElseBlock(ctx);
}