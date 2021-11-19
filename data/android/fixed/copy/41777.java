@org.springframework.web.bind.annotation.RequestMapping(value = "/divide/{st1}/{st2}")
public double divideValues(@org.springframework.web.bind.annotation.PathVariable(value = "st1")
java.lang.String st1, @org.springframework.web.bind.annotation.PathVariable(value = "st2")
java.lang.String st2) {
    double d1 = java.lang.Double.parseDouble(st1);
    double d2 = java.lang.Double.parseDouble(st2);
    double result = d1 / d2;
    return result;
}