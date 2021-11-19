public static com.github.yoojia.inputs.Schema RangeValue(final float min, final float max) {
    return com.github.yoojia.inputs.ValueSchema.ABTest(new com.github.yoojia.inputs.RangeValueBridge(min, max)).msg((((("输入数值大小必须在[" + min) + ",") + max) + "]之间"));
}