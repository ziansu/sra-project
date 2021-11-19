public it.lucavercelli.photo.FileRecord save(it.lucavercelli.photo.FileRecord f) {
    return em.merge(f);
}