public static void setColorProperty(java.lang.String Name, java.lang.String Value) {
    sagex.api.Configuration.SetProperty(Name, Value);
    sagex.api.Configuration.SetProperty((((SageCollegeProject.menu.Props) + Name) + (SageCollegeProject.menu.ColorPropAdder)), Value);
}