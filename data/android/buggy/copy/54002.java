public java.lang.Object getValue() {
    switch (mType) {
        case IDENTIFY :
            mIdentifyResult.getValue();
        case FIND :
            mFindResult.getValue();
        case FEATURE :
            mFeature.getId();
    }
    return null;
}