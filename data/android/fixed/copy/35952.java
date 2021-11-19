@java.lang.Override
@org.zkoss.bind.annotation.NotifyChange(value = { "items" , "selected" })
public void execute() {
    for (org.jtalks.poulpe.model.entity.Rank current : items.getSelection()) {
        rankService.deleteRank(current);
        items.remove(current);
    }
}