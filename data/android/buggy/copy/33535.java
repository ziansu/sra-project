public static final com.samrj.devil.math.Vec3 negate(com.samrj.devil.math.Vec3 v) {
    com.samrj.devil.math.Vec3 result = new com.samrj.devil.math.Vec3();
    com.samrj.devil.math.Vec3.negate(result, result);
    return result;
}