@org.springframework.web.bind.annotation.RequestMapping(value = "/sum")
java.lang.String sum(@org.springframework.web.bind.annotation.RequestParam(value = "a")
java.lang.Integer a, @org.springframework.web.bind.annotation.RequestParam(value = "b")
java.lang.Integer b) {
    return java.lang.String.valueOf(((a + b) + 1));
}