private boolean parseElfAndAddToModel(org.eclipse.core.resources.IResourceDelta delta) {
    fzi.mottem.code2model.elf2ecore.ELFExtractorJob job = new fzi.mottem.code2model.elf2ecore.ELFExtractorJob(delta.getResource());
    job.setPriority(Job.BUILD);
    job.schedule();
    return false;
}