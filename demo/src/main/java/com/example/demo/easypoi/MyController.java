//package com.example.demo.easypoi;
//
//import cn.afterturn.easypoi.excel.ExcelExportUtil;
//import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
//import com.example.demo.easypoi.entity.Eye;
//import com.example.demo.easypoi.entity.Student;
//
//import org.apache.poi.ss.usermodel.Workbook;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.BufferedOutputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
///**
// * ClassName:MyController
// * Package:com.rabbit.club.easypoi
// * Description:
// *
// * @date:2019/12/5 19:37
// * @author:廖凡
// */
//@Controller()
//public class MyController {
//
//    @PostMapping("/student")
//    @ResponseBody
//    public String impot(MultipartFile file){
//        try {
////            ExcelImportUtil.importExcel(file.getInputStream(), Student.class,params)
//        }catch (Exception e){
//
//        }
//        return "ok";
//    }
//    @GetMapping(value="/export")
//    @ResponseBody
//    public String exportExcelTest(HttpServletResponse response){
//        // 获取workbook对象
//        Workbook workbook = exportSheetByTemplate() ;
//        // 判断数据
//        if(workbook == null) {
//            return "fail";
//        }
//        // 设置excel的文件名称
//        String excelName = "测试excel" ;
//        // 重置响应对象
//        response.reset();
//        // 当前日期，用于导出文件名称
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        String dateStr = "["+excelName+"-"+sdf.format(new Date())+"]";
//        // 指定下载的文件名--设置响应头
//        response.setHeader("Content-Disposition", "attachment;filename=" +dateStr+".xls");
//        response.setContentType("application/vnd.ms-excel;charset=UTF-8");
//        response.setHeader("Pragma", "no-cache");
//        response.setHeader("Cache-Control", "no-cache");
//        response.setDateHeader("Expires", 0);
//        // 写出数据输出流到页面
//        try {
//            OutputStream output = response.getOutputStream();
//            BufferedOutputStream bufferedOutPut = new BufferedOutputStream(output);
//            workbook.write(bufferedOutPut);
//            bufferedOutPut.flush();
//            bufferedOutPut.close();
//            output.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "success";
//    }
//
//    public Workbook exportSheetByTemplate(){
//        // 查询数据,此处省略
//        List<Student> list = new ArrayList<>();
//        int count1 = 0 ;
//        Student easyPOIModel11 = new Student("张三",23,"李四",new Eye(5.0,4.9)) ;
//        Student easyPOIModel12 = new Student("张三",23,"李四",new Eye(5.0,4.9)) ;
//        list.add(easyPOIModel11) ;
//        list.add(easyPOIModel12) ;
//        // 设置导出配置
//        // 获取导出excel指定模版
//        TemplateExportParams params = new TemplateExportParams("D:\\lf\\01.参考资料\\开发工具\\sutdent.xls");
//        // 标题开始行
//        // params.setHeadingStartRow(0);
//        // 标题行数
//        // params.setHeadingRows(2);
//        // 设置sheetName，若不设置该参数，则使用得原本得sheet名称
//        params.setSheetName("班级信息");
//        Map<String,Object> map = new HashMap<String,Object>() ;
//        map.put("list",list) ;
//        // 导出excel
//        return ExcelExportUtil.exportExcel(params, map);
//    }
//}
