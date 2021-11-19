public void addChild(org.apache.zeppelin.notebook.Folder child) {
    if (child == (this))
        return ;
    
    children.put(child.getId(), child);
}