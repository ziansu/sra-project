public java.lang.Iterable<com.bayou.domains.Review> findByReviewee(java.lang.Long id, java.lang.Integer page) {
    return repo.findByReviewee(id, pageAndSortByIdDesc(page));
}