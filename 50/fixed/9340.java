public static void removeItemFromCurrentItemListInCurrentTodo(int todoIndex, int itemIndex) {
    ssd.project.mickeycj.todosapp.model.Repository.removeItemFromCurrentItemListInCurrentTodo(todoIndex, ssd.project.mickeycj.todosapp.model.Repository.currentRepository.getItemFrom(todoIndex, itemIndex).getTitle());
}