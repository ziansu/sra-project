@java.lang.Override
public void apply(final htsjdk.variant.variantcontext.VariantContext variant, final org.broadinstitute.hellbender.engine.ReadsContext readsContext, final org.broadinstitute.hellbender.engine.ReferenceContext referenceContext, final org.broadinstitute.hellbender.engine.FeatureContext featureContext) {
    try {
        output.addToCollector(variant);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}