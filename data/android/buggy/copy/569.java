@org.junit.Test
public void mapEnumToString() throws io.beanmapper.exceptions.BeanMappingException {
    io.beanmapper.testmodel.enums.ColorEntity colorEntity = new io.beanmapper.testmodel.enums.ColorEntity();
    colorEntity.setCurrentColor(ColorEntity.RGB.GREEN);
    io.beanmapper.testmodel.enums.ColorStringResult colorStringResult = beanMapper.map(colorEntity, io.beanmapper.testmodel.enums.ColorStringResult.class);
    org.junit.Assert.assertEquals("GREEN", colorStringResult.currentColor);
}