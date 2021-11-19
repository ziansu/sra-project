@org.thiki.kanban.entry.RequestMapping(value = "/boards/{boardId}/entries/{id}", method = RequestMethod.PUT)
public org.springframework.http.HttpEntity<org.thiki.kanban.entry.EntryResource> update(@org.thiki.kanban.entry.RequestBody
org.thiki.kanban.entry.Entry entry, @org.thiki.kanban.entry.PathVariable
java.lang.String id, @org.thiki.kanban.entry.PathVariable
java.lang.String boardId) {
    entry.setId(id);
    org.thiki.kanban.entry.Entry updatedEntry = entriesService.update(entry);
    return org.thiki.kanban.foundation.common.Response.build(new org.thiki.kanban.entry.EntryResource(updatedEntry, boardId));
}