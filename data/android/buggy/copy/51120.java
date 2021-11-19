@java.lang.Override
public double log10PriorProbability(final org.broadinstitute.hellbender.utils.hmm.CopyNumberTriState state, final org.broadinstitute.hellbender.tools.exome.Target target) {
    org.broadinstitute.hellbender.utils.Utils.nonNull(state);
    org.broadinstitute.hellbender.utils.Utils.nonNull(target);
    return state == (CopyNumberTriState.NEUTRAL) ? log10OneMinus2P : log10P;
}