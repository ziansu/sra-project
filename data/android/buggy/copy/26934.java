protected java.lang.Object instantiateArray(org.nustaq.serialization.FSTClazzInfo.FSTFieldInfo referencee, int readPos) throws java.lang.Exception {
    java.lang.Object res = readArray(referencee);
    if (!(referencee.isFlat())) {
        objects.registerObjectForRead(res, readPos);
    }
    return res;
}