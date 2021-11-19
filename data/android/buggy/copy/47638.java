public boolean queriedObjectAtIndexHasCompositeIntegerValue(int index, int expectedIntValue) {
    org.ccsds.moims.mo.comprototype.archivetest.structures.TestObjectPayload objectPayload = ((org.ccsds.moims.mo.comprototype.archivetest.structures.TestObjectPayload) (queriedObjectList.get(index)));
    return (objectPayload.getCompositeField().getIntegerField().intValue()) == expectedIntValue;
}