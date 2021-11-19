@java.lang.Override
public org.wso2.siddhi.core.event.stream.StreamEvent find(org.wso2.siddhi.core.event.state.StateEvent matchingEvent, java.lang.Object candidateEvents, org.wso2.siddhi.core.event.stream.StreamEventCloner candidateEventCloner) {
    this.initExpressionLogic();
    java.util.List<org.wso2.carbon.analytics.datasource.commons.Record> records = this.findRecords(matchingEvent, candidateEvents, candidateEventCloner);
    return org.wso2.carbon.analytics.eventtable.AnalyticsEventTableUtils.recordsToStreamEvent(this.myAttrs, records);
}