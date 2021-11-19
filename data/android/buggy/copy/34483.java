public void setElements(final java.util.List<org.palladiosimulator.pcm.core.entity.Entity> elements) {
    org.apache.commons.lang3.Validate.validState((!(this.finalised)), "setting values is only allowed if this configuration is not yet finalised");
    this.elements = elements;
}