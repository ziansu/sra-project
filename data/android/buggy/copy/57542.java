public void save(li.itcc.hackathon15.services.PoiDetailBean bean, android.graphics.Bitmap bitmap) {
    new li.itcc.hackathon15.poiadd.PoiAddSaver.SaveTask(bitmap).execute(bean);
}