@java.lang.Override
public org.springframework.data.domain.Page<com.liberty.model.AuthorEntity> getPageWithData(java.lang.Integer page, java.lang.Integer size) {
    return authorRepository.findAll(new org.springframework.data.domain.PageRequest(page, size));
}