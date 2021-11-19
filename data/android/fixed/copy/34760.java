private int getMaxUncompressedRecordsBits() {
    return (((((transmission.getMaxPayloadBits()) - (uk.ac.ucl.excites.sapelli.transmission.model.content.RecordsPayload.FORMAT_VERSION_SIZE)) - 1) - (uk.ac.ucl.excites.sapelli.storage.model.Model.MODEL_ID_SIZE)) - (model.getNumberOfSchemata())) - (uk.ac.ucl.excites.sapelli.transmission.model.content.RecordsPayload.COMPRESSION_FLAG_FIELD.size());
}