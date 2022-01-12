public se.plushogskolan.restcaseservice.model.DTOWorkItem getDTOWorkItemById(java.lang.Long id) {
    se.plushogskolan.casemanagement.model.WorkItem workItem = getWorkItemById(id);
    return se.plushogskolan.restcaseservice.model.DTOWorkItem.toDTO(workItem);
}