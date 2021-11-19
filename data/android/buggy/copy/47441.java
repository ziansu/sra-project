com.mongodb.bulk.BulkWriteError getBulkWriteError(final com.mongodb.WriteConcernException writeException) {
    return new com.mongodb.bulk.BulkWriteError(writeException.getErrorCode(), writeException.getErrorMessage(), translateGetLastErrorResponseToErrInfo(writeException.getResponse()), 0);
}