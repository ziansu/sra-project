@java.lang.Override
public com.pratilipi.data.type.Author getAuthorByUserId(java.lang.Long userId) {
    for (com.pratilipi.data.type.Author author : com.pratilipi.data.mock.AuthorMock.AUTHOR_TABLE)
        if (author.getUserId().equals(userId))
            return author;
        
    
    return null;
}