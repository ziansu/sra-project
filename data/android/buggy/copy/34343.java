@java.lang.Override
public java.util.List<com.softserve.osbb.model.Contract> getAllContractsBySearchTerm(java.lang.String searchTerm) throws java.lang.Exception {
    return (searchTerm == null) || (searchTerm.isEmpty()) ? com.softserve.osbb.service.impl.ContractServiceImpl.EMPTY_LIST : contractRepository.getAllContractsBySearchParam(searchTerm);
}