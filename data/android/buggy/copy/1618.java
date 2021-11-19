@java.lang.Override
public int advance(int target) throws java.io.IOException {
    while ((doc = nextDoc()) < target) {
        return doc;
    } 
    return doc;
}