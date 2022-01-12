@org.junit.Test
public void getData() {
    java.util.List<com.cidic.sdx.model.BrandModel> list = brandServiceImpl.getBrandData("0");
    java.lang.System.out.println(list.size());
}