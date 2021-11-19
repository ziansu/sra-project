@java.lang.Override
public void CreateList(net.adamhilton.handylyst.data.model.List list) {
    if ((list.getId()) == 0) {
        listRepo.create(list);
    }else {
        listRepo.update(list);
    }
    view.GoBack();
}