@java.lang.Override
public void addTo(io.xrates.backend.datamodel.beans.User user) {
    if ((toList) == null) {
        toList = new java.util.ArrayList<io.xrates.backend.datamodel.beans.User>();
    }
    toList.add(user);
}