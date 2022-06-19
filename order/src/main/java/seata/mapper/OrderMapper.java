package seata.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * @author rpf
 * @version 1.0
 * @date 2022/6/19 16:14
 */
@Mapper
public interface OrderMapper {

    @Update("insert into `order` values(1, 'asdsa')")
    void addOrder();
}
