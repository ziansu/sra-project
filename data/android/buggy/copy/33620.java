public java.util.List<com.langon.model.Comment> findoByPhotoId(java.lang.Long photoId) {
    return commentDao.findByPhotoId(photoId);
}