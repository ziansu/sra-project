@java.lang.Override
public void visit(int docID, byte[] packedValue) throws java.io.IOException {
    currentNode.get().addDoc(docID, packedValue);
}