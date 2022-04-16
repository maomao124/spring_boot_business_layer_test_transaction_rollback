package mao.spring_boot_business_layer_test_transaction_rollback.controller;


import mao.spring_boot_business_layer_test_transaction_rollback.entity.Student;
import mao.spring_boot_business_layer_test_transaction_rollback.service.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mao
 * @since 2022-04-16
 */
@Controller
@RequestMapping("/")
public class StudentController
{
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    IStudentService studentService;

    @RequestMapping("studentList")
    @ResponseBody
    public List<Student> getStudentList()
    {
        List<Student> studentList = studentService.list();
        return studentList;
    }

    @RequestMapping("deleteStudent")
    @ResponseBody
    public String deleteStudent(Long studentNo)
    {
        log.debug(studentNo.toString());
        return "success";
    }

    @RequestMapping("student")
    public String getHTML()
    {
        return "student";
    }
}

