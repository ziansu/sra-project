public void scheduleSending(uk.ac.ucl.excites.sapelli.storage.model.RecordReference recordRef, uk.ac.ucl.excites.sapelli.transmission.model.Correspondent receiver) {
    tStore.storeTransmittableRecord(receiver, recordRef, null);
}