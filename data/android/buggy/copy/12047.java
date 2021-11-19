@java.lang.Override
public void update(java.util.Observable data, java.lang.Object list) {
    if (!(data instanceof masks.DataManager))
        return ;
    
    this.data = ((masks.DataManager) (data));
    table.setItems(this.data.getData());
}