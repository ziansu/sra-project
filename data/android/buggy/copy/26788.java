public boolean addSymptom(fr.emn.elastuff.perCEPtion.Symptom s) {
    fr.emn.elastuff.perCEPtion.QueueSymptom.logger.debug(("Add Symptom : " + s));
    this.purgeQueue();
    return super.add(s);
}