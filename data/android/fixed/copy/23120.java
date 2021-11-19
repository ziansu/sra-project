public java.lang.String publishMedia(java.lang.String participantId, boolean isOffer, java.lang.String sdp, boolean doLoopback, org.kurento.client.MediaElement... mediaElements) throws org.kurento.room.exception.AdminException {
    return publishMedia(participantId, isOffer, sdp, null, null, doLoopback, mediaElements);
}