package com.one.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @作者: one者天下
 * @时间: 2021/5/17 21:52
 * @描述: table的表现层
 */
@Controller
public class TableController {

    @GetMapping("/basic_table.html")
    public String basicTable(){
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table.html")
    public String dynamicTable(){
        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table.html")
    public String responsiveTable(){
        return "table/responsive_table";
    }

    @GetMapping("/editable_table.html")
    public String editableTable(){
        return "table/editable_table";
    }
}
