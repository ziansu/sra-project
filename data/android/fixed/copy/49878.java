@org.springframework.data.jpa.repository.Query(value = "update EventComment et set et.text = :text where et.id = :commentId")
@javax.transaction.Transactional
@org.springframework.data.jpa.repository.Modifying
void updateEventCommentByCommentId(@org.springframework.data.repository.query.Param(value = "commentId")
java.lang.Long commentId, @org.springframework.data.repository.query.Param(value = "text")
java.lang.String text);