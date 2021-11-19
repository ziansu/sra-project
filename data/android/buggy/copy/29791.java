@process.test.Test
public void shouldRunStaticCall() throws java.io.IOException, java.lang.InterruptedException, process.ProcessException {
    java.lang.String inFile = "reads_1.fq";
    java.lang.String outFile = "test.sgr";
    process.RawToProfileConverter.procedureRaw(bowtieParams, inFile, outFile, true, true, "GENOMEVERSION", genomeBowtie2, "resources/bowtie2/example/reads/", "resources/processTest/results/");
}