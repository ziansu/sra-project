@java.lang.Override
public hu.schonherz.project.admin.service.api.vo.CompanyVo findByDomainAddressContaining(java.lang.String source) {
    hu.schonherz.project.admin.service.api.vo.CompanyVo companyVo = hu.schonherz.project.admin.service.mapper.company.CompanyEntityVoMapper.toVo(companyRepository.findByDomainAddressContaining(source));
    return companyVo;
}