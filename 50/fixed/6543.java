@java.lang.Override
public org.deeplearning4j.nn.updater.aggregate.UpdaterAggregator call(org.deeplearning4j.nn.updater.aggregate.UpdaterAggregator updaterAggregator, org.deeplearning4j.nn.updater.aggregate.UpdaterAggregator updaterAggregator2) throws java.lang.Exception {
    if (updaterAggregator == null)
        return updaterAggregator2;
    else
        if (updaterAggregator2 == null)
            return updaterAggregator;
        
    
    updaterAggregator.merge(updaterAggregator2);
    return updaterAggregator;
}