@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
public java.util.List<fr.bougly.web.dtos.AccountDto> findAllComptes() {
    java.util.List accountList = accountRepository.findAll();
    return fr.bougly.service.helper.MapperBeanUtil.convertAccountListToAccountDtoList(accountList);
}