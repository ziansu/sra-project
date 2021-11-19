@org.springframework.web.bind.annotation.RequestMapping(value = "/complete", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void complete(@org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.String id) {
    todo.TodoItem item = repository.findOne(id);
    if (item != null) {
        item.complete();
        repository.save(item);
    }
}