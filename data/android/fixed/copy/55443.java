public void generateComputationalServiceListener_ComputationalServiceCompiler(iotsuite.semanticmodel.Information infoConsumeInfo) {
    iotsuite.codegenerator.JavaFrameworkFromST generatedComputationalService = new iotsuite.codegenerator.JavaFrameworkFromST();
    iotsuite.codegenerator.CompilationUnit generatedCU = generatedComputationalService.generateComputationalServiceListener(infoConsumeInfo);
    iotsuite.codegenerator.SourceFileDumper dumpGeneratedComputationalService = new iotsuite.codegenerator.SourceFileDumper();
    dumpGeneratedComputationalService.dumpCompilationUnit(generatedCU);
}