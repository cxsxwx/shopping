package com.zzptc.shopping.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeGenerator {

    public static void main(String[] args) {
        String pkgPath = System.getProperty("user.dir") + "/src/main/java";
        String URL = "jdbc:mysql:///shopping?characterEncoding=utf-8";
        FastAutoGenerator.create(URL,"root","123456").globalConfig(builder -> {
            builder.outputDir(pkgPath).author("cxsxwx").disableOpenDir().fileOverride();
        }).packageConfig(builder -> {
            builder.parent("com.zzptc.shopping");
        }).strategyConfig((scanner, builder)-> {
            builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                    .controllerBuilder().enableRestStyle().enableHyphenStyle()
                    .entityBuilder().enableLombok().addTableFills(
                            new Column("create_time", FieldFill.INSERT)
                    ).build();
        }).execute();
    }

    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
