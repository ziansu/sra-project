public boolean handleEvent2(java.lang.String aName, java.lang.String aPath) {
    if (conditionFunction2(aName, aPath))
        doReaction2(aName);
    else
        if ((mNext) != null)
            return mNext.handleEvent2(aName, aPath);
        
    
    return true;
}