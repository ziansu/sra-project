public applicationServices.common.IActionResult<java.util.List<entities.Request>> getRequestList(entities.User approver) {
    java.util.List<entities.Request> requests = requestRepository.getList(approver.getId());
    return Ok(requests);
}