@java.lang.Override
public com.cimat.meetme.entity.Images upload(com.cimat.meetme.entity.Images images) {
    return genericDao.create(images);
}