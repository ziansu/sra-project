@java.lang.Override
public javax.persistence.criteria.Predicate toPredicate(javax.persistence.criteria.Root<br.com.maiscambio.model.entity.Estabelecimento> root, javax.persistence.criteria.CriteriaQuery<?> criteriaQuery, javax.persistence.criteria.CriteriaBuilder criteriaBuilder) {
    return criteriaBuilder.equal(root.get("pessoa").get("pessoaId"), pessoaId);
}