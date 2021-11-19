private void sqwrlQuery2DRL(@org.checkerframework.checker.nullness.qual.NonNull
org.swrlapi.sqwrl.SQWRLQuery query) throws org.swrlapi.exceptions.TargetSWRLRuleEngineException {
    if (!(query.hasSQWRLCollections()))
        sqwrlNonCollectionQuery2DRL(query);
    else
        sqwrlCollectionQuery2DRL(query);
    
}