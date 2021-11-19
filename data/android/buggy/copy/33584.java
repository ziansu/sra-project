public boolean queriedObjectAtIndexIsInt(int index, int expectedValue) {
    java.lang.Integer objectPayload = ((java.lang.Integer) (queriedObjectList.get(index)));
    return (objectPayload.intValue()) == expectedValue;
}