package mao.spring_boot_business_layer_test_transaction_rollback.service.impl;

import mao.spring_boot_business_layer_test_transaction_rollback.entity.Student;
import mao.spring_boot_business_layer_test_transaction_rollback.mapper.StudentMapper;
import mao.spring_boot_business_layer_test_transaction_rollback.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mao
 * @since 2022-04-16
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService
{

}
