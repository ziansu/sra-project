private java.util.ArrayList<com.shareyourproxy.api.domain.model.Group> getGroupData() {
    if ((getLoggedInUser().groups()) != null) {
        return getLoggedInUser().groups();
    }else {
        return null;
    }
}