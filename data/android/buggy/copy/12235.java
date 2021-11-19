public static org.gufroan.wearwolf.data.Part goBack() {
    org.gufroan.wearwolf.data.Part result = null;
    if ((org.gufroan.wearwolf.NavigationEngine.cursor.getParent()) != null) {
        result = org.gufroan.wearwolf.NavigationEngine.cursor.getParent().getData();
    }
    return result;
}