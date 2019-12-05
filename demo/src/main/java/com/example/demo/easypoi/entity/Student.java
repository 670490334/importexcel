package com.example.demo.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * ClassName:Student
 * Package:com.rabbit.club.easypoi.entity
 * Description:
 *
 * @date:2019/12/5 19:33
 * @author:廖凡
 */
@Data
@ExcelTarget("Student")
@ToString
public class Student implements Serializable {
    @Excel(name = "名称")
    private String name;

    @Excel(name = "年龄")
    private Integer age;

    @Excel(name = "父亲名")
    private String parent;

    @ExcelEntity(id = "eye",name = "视力")
    private Eye eye;
    public Student(){}
    public Student(String name,Integer age,String parent, Eye eye){
        super();
        this.age = age;
        this.eye = eye;
        this.name = name;
        this.parent =parent;
    }
}
