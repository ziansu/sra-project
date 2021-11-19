@java.lang.Override
public void setAnotationTitle(java.lang.String title) {
    this.title = title;
    if ((title != null) && ((getDefualtToolbar()) != null)) {
        getDefualtToolbar().setTitle(title.toString());
    }
}