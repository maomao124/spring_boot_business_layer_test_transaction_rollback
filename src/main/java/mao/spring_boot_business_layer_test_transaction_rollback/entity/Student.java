package mao.spring_boot_business_layer_test_transaction_rollback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 *
 * </p>
 *
 * @author mao
 * @since 2022-04-16
 */
@ApiModel(value = "Student对象", description = "")
public class Student implements Serializable
{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("学生学号")
    @TableId(value = "student_no", type = IdType.AUTO)
    private Long studentNo;

    @ApiModelProperty("学生姓名")
    private String name;

    @ApiModelProperty("学生性别")
    private String sex;

    @ApiModelProperty("电话号码")
    private String telephoneNumber;

    @ApiModelProperty("家庭电话号码")
    private String familyTelephoneNumber;

    @ApiModelProperty("生日信息，由程序填充，这里用varchar型")
    private String birthday;

    @ApiModelProperty("家庭地址")
    private String address;

    @ApiModelProperty("身份证号码")
    private String idCard;

    @ApiModelProperty("电子邮箱")
    private String email;

    @ApiModelProperty("寝室号")
    private String dormitoryNumber;

    @ApiModelProperty("所属班级编号")
    private Long classNo;

    @ApiModelProperty("状态，在读、退学或者毕业")
    private String state;

    @ApiModelProperty("备注")
    private String remarks;


    public Long getStudentNo()
    {
        return studentNo;
    }

    public void setStudentNo(Long studentNo)
    {
        this.studentNo = studentNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getTelephoneNumber()
    {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber)
    {
        this.telephoneNumber = telephoneNumber;
    }

    public String getFamilyTelephoneNumber()
    {
        return familyTelephoneNumber;
    }

    public void setFamilyTelephoneNumber(String familyTelephoneNumber)
    {
        this.familyTelephoneNumber = familyTelephoneNumber;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getIdCard()
    {
        return idCard;
    }

    public void setIdCard(String idCard)
    {
        this.idCard = idCard;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getDormitoryNumber()
    {
        return dormitoryNumber;
    }

    public void setDormitoryNumber(String dormitoryNumber)
    {
        this.dormitoryNumber = dormitoryNumber;
    }

    public Long getClassNo()
    {
        return classNo;
    }

    public void setClassNo(Long classNo)
    {
        this.classNo = classNo;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getRemarks()
    {
        return remarks;
    }

    public void setRemarks(String remarks)
    {
        this.remarks = remarks;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("studentNo：").append(studentNo).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("sex：").append(sex).append('\n');
        stringbuilder.append("telephoneNumber：").append(telephoneNumber).append('\n');
        stringbuilder.append("familyTelephoneNumber：").append(familyTelephoneNumber).append('\n');
        stringbuilder.append("birthday：").append(birthday).append('\n');
        stringbuilder.append("address：").append(address).append('\n');
        stringbuilder.append("idCard：").append(idCard).append('\n');
        stringbuilder.append("email：").append(email).append('\n');
        stringbuilder.append("dormitoryNumber：").append(dormitoryNumber).append('\n');
        stringbuilder.append("classNo：").append(classNo).append('\n');
        stringbuilder.append("state：").append(state).append('\n');
        stringbuilder.append("remarks：").append(remarks).append('\n');
        return stringbuilder.toString();
    }
}
