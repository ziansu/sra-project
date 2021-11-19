public com.jige.mylistnet.Sample getNextSample() {
    if ((cur) >= (Samples.size()))
        return null;
    
    return Samples.get(((cur)++));
}