@org.apache.ibatis.annotations.Insert(value = "INSERT INTO tb_stock(num, name, price) VALUES(#{num}, #{name}, #{price})")
public int insertStock(@org.apache.ibatis.annotations.Param(value = "num")
java.lang.String num, @org.apache.ibatis.annotations.Param(value = "name")
java.lang.String name, @org.apache.ibatis.annotations.Param(value = "price")
float price);