@com.funliving.info.resource.PUT
@com.funliving.info.resource.Path(value = "apply")
@com.funliving.info.resource.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
@com.funliving.info.resource.Produces(value = "text/plain")
public int createApply(@com.funliving.info.resource.BeanParam
com.funliving.info.repository.entity.Apply apply) {
    applyRepository.create(apply);
    return apply.getId();
}