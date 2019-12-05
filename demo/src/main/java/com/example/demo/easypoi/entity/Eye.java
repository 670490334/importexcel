package com.example.demo.easypoi.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * ClassName:Eye
 * Package:com.rabbit.club.easypoi.entity
 * Description:
 *
 * @date:2019/12/5 19:35
 * @author:廖凡
 */
@Data
@ExcelTarget("Eye")
@ToString
public class Eye implements Serializable {

    @Excel(name = "左眼")
    private Double left;
    @Excel(name = "右眼")
    private Double right;

    public Eye(){}
    public Eye(Double left, Double right){
        super();
        this.left = left;
        this.right = right;
    }
}
