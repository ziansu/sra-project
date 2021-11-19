public void initTree(java.util.List<com.levigo.jbig2.decoder.huffman.HuffmanTable.Code> codeTable) {
    preprocessCodes(codeTable);
    for (com.levigo.jbig2.decoder.huffman.HuffmanTable.Code c : codeTable) {
        rootNode.append(c);
    }
    java.lang.System.out.println("");
}