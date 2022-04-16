package mao.spring_boot_business_layer_test_transaction_rollback.mapper;

import mao.spring_boot_business_layer_test_transaction_rollback.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author mao
 * @since 2022-04-16
 */

@Mapper
public interface StudentMapper extends BaseMapper<Student>
{

}
