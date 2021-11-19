public java.util.ArrayList<edu.umro.dicom.client.Series.InstanceList.Instance> getList() {
    try {
        acquire();
        java.util.Collections.sort(instList);
        return instList;
    } finally {
        release();
    }
}