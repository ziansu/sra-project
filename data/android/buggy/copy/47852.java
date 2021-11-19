@javax.transaction.Transactional
@java.lang.Override
public boolean checkIfMemberExistsInChatroom(java.lang.Long member_id, java.lang.Long room_id) {
    return (repository.findByRoomIdAndMember(member_id, room_id)) != null;
}