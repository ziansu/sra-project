public void deletePTask(int id) {
    for (com.finalproject.softspec.check.model.Task t : primaryList) {
        if ((t.getId()) == id) {
            primaryList.remove(t);
        }
    }
}