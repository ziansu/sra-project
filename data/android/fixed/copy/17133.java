@lombok.SneakyThrows
public void unmuteParticipant(java.util.UUID participantId) {
    participantApi.unmuteParticipant(participantId.toString());
}