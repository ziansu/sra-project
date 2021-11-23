public java.lang.String save() {
    facade.create(current);
    web.FacesUtil.addInfoMessage("Book successfully saved");
    current = null;
    return "findBooks.xhtml";
}