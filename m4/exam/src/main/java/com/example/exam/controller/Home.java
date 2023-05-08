package com.example.exam.controller;

import com.example.exam.model.Produce;
import com.example.exam.model.ProduceType;
import com.example.exam.service.IProduceService;
import com.example.exam.service.IProduceTypeService;
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
import java.util.List;
import java.util.Optional;

@Controller
public class Home {

    @Autowired
    private IProduceService produceService;

    @Autowired
    private IProduceTypeService produceTypeService;

    @GetMapping("/list")
    public String display(Model model, @PageableDefault(value = 3)Pageable pageable,
                          @RequestParam("produceName")Optional<String> produceName,
                          @RequestParam("produceTypeName")Optional<String> produceTypeName,
                          @RequestParam("producePrice")Optional<Integer> producePrice) {
        Page<Produce> producePage;
        String condition = "";

        if (produceName.isPresent() || produceTypeName.isPresent() || producePrice.isPresent()) {
            producePage = produceService.search(produceName.get(), produceTypeName.get(), producePrice.get(), pageable);
            model.addAttribute("producePage", producePage);
        }
        if (produceName.isPresent()) {
            condition += "&produceName=" + produceName.get();
            model.addAttribute("serviceType", produceName.get());
        }
        if (produceTypeName.isPresent()) {
            condition += "&produceTypeName=" + produceTypeName.get();
            model.addAttribute("produceTypeName", produceTypeName.get());
        }

        if (producePrice.isPresent()) {
            condition += "&producePrice=" + producePrice.get();
            model.addAttribute("producePrice", producePrice.get());
        } else {
            producePage= produceService.findAll(pageable);
            model.addAttribute("producePage",producePage);
        }

        List<ProduceType> produceTypeList = produceTypeService.findAll();
        model.addAttribute("produceTypeList",produceTypeList);
        model.addAttribute("condition",condition);
        return "list";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model) {
        List<ProduceType> produceTypeList = produceTypeService.findAll();
        Produce produce = new Produce();
        produce.setProduceType(new ProduceType());
        model.addAttribute("produceTypeList", produceTypeList);
        model.addAttribute("produce", produce);
        return "create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("produce") Produce produce, BindingResult bindingResult, Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            produce.setProduceType(new ProduceType());
            List<ProduceType> produceTypeList = produceTypeService.findAll();
            model.addAttribute("produceTypeList", produceTypeList);
            model.addAttribute("produce", produce);
            return "create";
        }
        produceService.save(produce);
        redirectAttributes.addFlashAttribute("mess", "Thêm mới thành công");
        return "redirect:/list";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        Produce produce = produceService.findById(id);
        model.addAttribute("produce", produce);
        return "list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("idDelete") Long id, RedirectAttributes redirectAttributes) {
        produceService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "Xoá thành công");
        return "redirect:/list";
    }
}
