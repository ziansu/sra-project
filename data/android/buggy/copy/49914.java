public void testAnonymous1() {
    assumeMinimumCapture = false;
    test("(function(){var a=10;(function(){var b=a;a++;alert(b)})()})();", ("{var a$$inline_0=10;" + ("{var b$$inline_1=a$$inline_0;" + "a$$inline_0++;alert(b$$inline_1)}}")));
    assumeMinimumCapture = true;
    test("(function(){var a=10;(function(){var b=a;a++;alert(b)})()})();", ("{var a$$inline_2=10;" + ("{var b$$inline_0=a$$inline_2;" + "a$$inline_2++;alert(b$$inline_0)}}")));
}