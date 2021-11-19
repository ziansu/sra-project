protected void createPopup(to.etc.domuidemo.pages.overview.menu.LinkButton clickednode) {
    to.etc.domuidemo.pages.overview.menu.SimplePopupMenu pm = new to.etc.domuidemo.pages.overview.menu.SimplePopupMenu();
    pm.addItem("Happy", "img/btnSmileySmiley.gif", null);
    pm.addItem("Sad", "img/btnSmileySad.gif", null);
    clickednode.appendBeforeMe(pm);
}