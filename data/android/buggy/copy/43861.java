@java.lang.Override
public void convert(@org.checkerframework.checker.nullness.qual.NonNull
org.swrlapi.sqwrl.SQWRLQuery query) throws org.swrlapi.exceptions.TargetSWRLRuleEngineException {
    getDroolsSWRLBodyAtomConverter().reset();
    getDroolsSWRLHeadAtomConverter().reset();
    sqwrlQuery2DRL(query);
}