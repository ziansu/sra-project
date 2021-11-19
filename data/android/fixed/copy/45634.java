public double calculateGainRatio(if4071.weka.classifier.Instances data, if4071.weka.classifier.Attribute attr) {
    double infoGain = calculateInfoGain(data, attr);
    double splitInfo = calculateSplitInfo(data, attr);
    if (splitInfo == 0.0)
        return -1.0;
    else
        return infoGain / splitInfo;
    
}