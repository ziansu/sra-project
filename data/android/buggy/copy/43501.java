public io.github.orangeutan.utils.StringListBuilder add(java.lang.Object str) {
    mStringList += (mStringList.equals("")) ? "" : (mSeperator) + (str.toString());
    return this;
}