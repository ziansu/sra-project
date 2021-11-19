public double Completion(mck.MatlabEngine eng) throws java.lang.Exception {
    double dProgress1 = GetRBVectorLength(sRightFoot);
    double dProgress2 = GetRBVectorLength(sLeftFoot);
    double dCompletion = (dProgress1 + dProgress2) / (2.0 * (dStartToBox));
    return dCompletion;
}