public java.util.List<org.egov.lcms.transactions.entity.JudgmentDocuments> getJudgmentDocList(final org.egov.lcms.transactions.entity.Judgment judgment) {
    final java.util.List<org.egov.lcms.transactions.entity.JudgmentDocuments> judgmentDOc = new java.util.ArrayList<org.egov.lcms.transactions.entity.JudgmentDocuments>();
    for (final org.egov.lcms.transactions.entity.JudgmentDocuments judgmentDoc : judgment.getJudgmentDocuments())
        judgmentDOc.add(judgmentDoc);
    
    return judgmentDOc;
}