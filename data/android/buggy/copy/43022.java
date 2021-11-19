public void save(org.w3c.dom.Document svgDocument) {
    generateSaveUI();
    if (noFileSpecified(svgFile)) {
        writeSVGToFile(svgDocument, svgFile);
    }
    return ;
}