@java.lang.Override
public void CreateList(net.adamhilton.handylyst.data.model.List list) {
    listRepo.create(list);
    view.GoBack();
}