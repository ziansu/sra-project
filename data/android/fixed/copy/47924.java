private void addOutputsToSubProcess(de.uni_goettingen.sub.commons.ocr.abbyy.server.AbbyyProcess subProcess, de.uni_goettingen.sub.commons.ocr.abbyy.server.AbbyyProcess process) {
    for (de.uni_goettingen.sub.commons.ocr.api.OcrFormat outputFormat : process.getAllOutputFormats()) {
        subProcess.addOutput(outputFormat);
    }
}