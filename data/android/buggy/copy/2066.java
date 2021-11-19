public java.util.List<se.grouprich.projectmanagement.model.WorkItem> removeWorkItem(se.grouprich.projectmanagement.model.WorkItem workItem) {
    return workItemRepository.removeById(workItem.getId());
}