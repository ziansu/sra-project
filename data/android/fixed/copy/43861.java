@org.checkerframework.checker.nullness.qual.NonNull
@java.lang.Override
public java.lang.String convert(@org.checkerframework.checker.nullness.qual.NonNull
org.swrlapi.sqwrl.SQWRLQuery query) throws org.swrlapi.exceptions.TargetSWRLRuleEngineException {
    getDroolsSWRLBodyAtomConverter().reset();
    getDroolsSWRLHeadAtomConverter().reset();
    return sqwrlQuery2DRL(query);
}