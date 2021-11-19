public void add(com.statnlp.experiment.smsnp.SMSNPEvaluator.Statistics s) {
    this.correct += s.correct;
    this.totalPred = s.totalPred;
    this.totalGold = s.totalGold;
}