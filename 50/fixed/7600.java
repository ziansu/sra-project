public void checkErrorAndCast(com.developmentontheedge.beans.DynamicPropertySet dps) {
    isError(dps);
    for (com.developmentontheedge.beans.DynamicProperty property : dps) {
        checkErrorAndCast(property);
    }
}