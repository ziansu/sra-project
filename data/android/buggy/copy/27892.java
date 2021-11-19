@java.lang.Override
public java.lang.Object getAsObject(javax.faces.context.FacesContext facesContext, javax.faces.component.UIComponent uiComponent, java.lang.String s) {
    return categoryService.findBy(s);
}