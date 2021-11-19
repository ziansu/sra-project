@com.anakinfoxe.reviewmonitor.resource.Path(value = "/stop/{brand}")
@com.anakinfoxe.reviewmonitor.resource.GET
public void stopCrawler(@com.anakinfoxe.reviewmonitor.resource.PathParam(value = "brand")
java.lang.String brand, @com.anakinfoxe.reviewmonitor.resource.DefaultValue(value = "")
@com.anakinfoxe.reviewmonitor.resource.QueryParam(value = "key")
java.lang.String key, @com.anakinfoxe.reviewmonitor.resource.DefaultValue(value = "")
@com.anakinfoxe.reviewmonitor.resource.QueryParam(value = "date")
java.lang.String date) {
    if (key.equals(key_)) {
        stopRunning(brand);
    }
}