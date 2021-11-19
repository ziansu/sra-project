private void serializeData() {
    for (fr.inria.spirals.repairnator.serializer.AbstractDataSerializer serializer : this.serializers) {
        serializer.serializeData(this.inspector);
    }
}