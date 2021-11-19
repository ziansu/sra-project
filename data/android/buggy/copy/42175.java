public void actionPerformed(java.awt.event.ActionEvent ev) {
    if ((naviStartNode.isSelected()) && (!(isSelectedTagetNode))) {
        isSelectedStartNode = true;
    }else {
        naviStartNode.setSelected(false);
    }
}