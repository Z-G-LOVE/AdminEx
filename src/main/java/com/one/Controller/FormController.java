package com.one.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @作者: one者天下
 * @时间: 2021/5/17 23:33
 * @描述: 处理表单
 */
@Controller
public class FormController {

    @GetMapping("/dropzone.html")
    public String dropzone(){
        return "form/dropzone";
    }

    @GetMapping("/editors.html")
    public String editors(){
        return "form/editors";
    }

    @GetMapping("/form_advanced_components.html")
    public String formAdvancedComponents(){
        return "form/form_advanced_components";
    }

    @GetMapping("/form_layouts.html")
    public String formLayouts(){
        return "form/form_layouts";
    }

    @GetMapping("/form_validation.html")
    public String formValidation(){
        return "form/form_validation";
    }

    @GetMapping("/form_wizard.html")
    public String formWizard(){
        return "form/form_wizard";
    }

    @GetMapping("/inline_editors.html")
    public String inlineEditors(){
        return "form/inline_editors";
    }

    @GetMapping("/pickers.html")
    public String pickers(){
        return "form/pickers";
    }
}
