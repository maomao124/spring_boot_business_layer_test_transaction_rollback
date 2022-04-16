package mao.spring_boot_business_layer_test_transaction_rollback.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_business_layer_test_transaction_rollback
 * Package(包名): mao.spring_boot_business_layer_test_transaction_rollback.service
 * Class(测试类名): IStudentServiceTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/16
 * Time(创建时间)： 15:21
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
@Transactional
@Rollback(true)
class IStudentServiceTest
{

    @Autowired
    IStudentService studentService;

    @Test
    public void delete() throws Exception
    {
        boolean b = studentService.removeById(202012341078L);
        System.out.println(b);
    }
}