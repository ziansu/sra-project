@org.apache.ibatis.annotations.Update(value = "UPDATE \"tokens\" SET \"token\" = #{token} where \"username\"= #{userName}")
public int updateToken(java.lang.String userName, java.lang.String token);