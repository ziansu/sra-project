@java.lang.Override
public edu.nyu.cascade.prover.Expression castToSize(edu.nyu.cascade.prover.Expression size) {
    return encoding.castToInteger(size, getSizeType().asBitVectorType().getSize());
}