@java.lang.Override
public nu.xom.Element serializeElement() {
    for (gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.serialization.SerializableSection serializableSection : serializableSectionList) {
        sectionElement.appendChild(serializableSection.serializeElement());
    }
    return sectionElement;
}