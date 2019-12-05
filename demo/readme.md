## easypoi导入

```xml
  <dependency>
            <groupId>cn.afterturn</groupId>
            <artifactId>easypoi-base</artifactId>
            <version>3.2.0</version>
        </dependency>
        <dependency>
            <groupId>cn.afterturn</groupId>
            <artifactId>easypoi-annotation</artifactId>
            <version>3.2.0</version>
        </dependency>
        <dependency>
            <groupId>cn.afterturn</groupId>
            <artifactId>easypoi-web</artifactId>
            <version>3.2.0</version>
        </dependency>
```

这里就说一下单元格合并的情况导入的问题：

直接使用

```java
 ExcelImportResult<Entity>> objectExcelImportResult = ExcelImportUtil.importExcelMore(file.getInputStream(), Entity.class, importParams);
```

导常规的   一个列名对应一个数据没问题；但是列名上游单元格组合名时会出现一定得问题；

![](D:\时效科技\git\导入\importexcel\demo\images\1575553712(1).png)



这个情况的出现我也不知道是为什么；



解决办法：

使用Map来获取表数据，再用表对应的字段去获取值；

```java
ExcelImportResult<Map<String,String>> objectExcelImportResult = ExcelImportUtil.importExcelMore(file.getInputStream(), Map.class, importParams);
            List<Map<String,String>> list = objectExcelImportResult.getList();
            for (int i = 0;i<list.size();i++){
                Map map = list.get(i);
                String name = (String) map.get("名称");
                String age = (String) map.get("年龄");
                String parent = (String) map.get("父亲名");
                String eye_left = (String) map.get("视力_左眼");
                String right = (String) map.get("右眼");
                student.setAge(Integer.valueOf(age));
                student.setName(name);
                student.setParent(parent);
                eye.setLeft(Double.valueOf(eye_left));
                eye.setRight(Double.valueOf(right));
                student.setEye(eye);
                log.info(student.toString());
            }
```



后续有好的办法  会更新 目前先就这样  把    我也没找到更好的办法。