public void addInfoIntoMaltObject() {
    if (checkCurrentTag("maltName"))
        malt.setNameOfMalt(text);
    else
        if (checkCurrentTag("maltweight")) {
            malt.setWeightOfMaltsInPounds(java.lang.Double.parseDouble(text));
        }
    
}