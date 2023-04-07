package com.example.examm4l2.controller;

import com.example.examm4l2.model.Build;
import com.example.examm4l2.model.Product;
import com.example.examm4l2.model.ProductType;
import com.example.examm4l2.service.IBuildSevice;
import com.example.examm4l2.service.IProductSevice;
import com.example.examm4l2.service.IProductTypeSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class Home {
    @Autowired
    private IBuildSevice buildSevice;

    @Autowired
    private IProductSevice productSevice;

    @Autowired
    private IProductTypeSevice productTypeSevice;



    @GetMapping("/list")
    public String display(Model model, @PageableDefault(value = 3) Pageable pageable,
                          @RequestParam("productName") Optional<String> productName,
                          @RequestParam("productTypeName")Optional<String> productTypeName,
                          @RequestParam("date")Optional<Date> date,
                          @RequestParam("quanlity")Optional<Integer> quanlity) {
        Page<Build> buildPage;
        String condition = "";

        if (productName.isPresent()) {
            condition += "&produceName=" + productName.get();
            model.addAttribute("productPage", productName.get());
        }
        if (productTypeName.isPresent()) {
            condition += "&productTypeName=" + productTypeName.get();
            model.addAttribute("productTypeName", productTypeName.get());
        }

        if (date.isPresent()) {
            condition += "&date=" + date.get();
            model.addAttribute("date", date.get());
        }
        if (quanlity.isPresent()) {
            condition += "&quanlity=" + quanlity.get();
            model.addAttribute("quanlity", quanlity.get());
        } else {
            buildPage = buildSevice.findAll(pageable);
            model.addAttribute("buildPage", buildPage);
        }

        List<Product> productList = productSevice.findAll();
        List<ProductType> productTypeList = productTypeSevice.findAll();
        model.addAttribute("productList", productList);
        model.addAttribute("productTypeList", productTypeList);
        model.addAttribute("condition", condition);
        return "list";
    }

//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable Long id, Model model){
//        model.addAttribute("build", buildSevice.findById(id));
//        model.addAttribute("product", productSevice.findAll());
//        model.addAttribute("productType", productTypeSevice.findAll());
//        return "/edit";
//    }
//
//    @PostMapping("/edit")
//    public String updateDB(@Valid @ModelAttribute("build") Build build, BindingResult result, RedirectAttributes redirectAttributes, Model model) {
//        if (result.hasErrors()) {
//            model.addAttribute("product", productSevice.findAll());
//            model.addAttribute("productType", productTypeSevice.findAll());
//            return "/edit";
//        }
//            redirectAttributes.addFlashAttribute("message", "edit ok");
//
//        buildSevice.save(build);
//        return "redirect:/list";
//    }
}
