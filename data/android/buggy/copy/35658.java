public static java.util.List<msi.gama.headless.job.IExperimentJob> loadAndBuildJobs(java.lang.String path) {
    java.lang.System.out.println((("path " + path) + " "));
    msi.gama.kernel.model.IModel model = msi.gama.headless.core.HeadlessSimulationLoader.loadModel(new java.io.File(path));
    return msi.gama.headless.xml.ScriptFactory.loadAndBuildJobs(model);
}