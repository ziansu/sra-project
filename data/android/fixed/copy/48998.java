public hu.bme.mit.inf.mqtt.common.data.Identity createIdentity() {
    hu.bme.mit.inf.mqtt.common.data.SectionArray sections = new hu.bme.mit.inf.mqtt.common.data.SectionArray(managedSections.toArray(new hu.bme.mit.inf.mqtt.common.data.Section[managedSections.size()]));
    return new hu.bme.mit.inf.mqtt.common.data.Identity(managedTurnout, sections);
}