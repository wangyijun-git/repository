package cn.itcast.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface AccountMapper {
    void transferOut(@Param("outName") String outName, @Param("money") double money);
    void transferIn(@Param("inName") String inName, @Param("money") double money);
}
