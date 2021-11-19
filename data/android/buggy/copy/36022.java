@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
public java.util.List<fr.bougly.web.dtos.AccountDto> findAllComptes() {
    java.util.List accountList = accountRepository.findAll();
    java.util.ArrayList accountDtoList = fr.bougly.service.helper.MapperBeanUtil.convertAccountListToAccountDtoList(accountList);
    return accountDtoList;
}