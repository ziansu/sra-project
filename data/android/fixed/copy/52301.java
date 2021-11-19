public void onTraversalDone(org.broadinstitute.sting.gatk.walkers.ClipReadsWalker.ClippingData data) {
    if ((out) != null)
        out.printf(data.toString());
    
}