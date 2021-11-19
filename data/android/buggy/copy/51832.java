@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    org.happysoft.zxsprite.SpriteToggler s = getSelectedSpriteToggler();
    boolean dirty = s.isDirty();
    parent.enableMenus(dirty);
}