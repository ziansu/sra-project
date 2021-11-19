@java.lang.Override
public com.dpu.entity.Trailer update(com.dpu.entity.Trailer trailer) {
    trailer.setModifiedOn(new java.util.Date());
    return trailerdao.update(trailer);
}