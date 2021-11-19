@java.lang.Override
public boolean bookExistsWithBookCode(java.lang.String bookCode) {
    if (com.leon.rfq.repositories.BookDaoImpl.logger.isDebugEnabled())
        com.leon.rfq.repositories.BookDaoImpl.logger.debug(("Request to check if book exists with bookCode: " + bookCode));
    
    return (this.bookMapper.bookExistsWithBookcode(bookCode)) != null;
}