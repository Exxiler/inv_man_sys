package com.inv_man_sys.inv_man_sys.Controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inv_man_sys.inv_man_sys.Entity.Invoice;
import com.inv_man_sys.inv_man_sys.Entity.User;
import com.inv_man_sys.inv_man_sys.Repository.InvoiceRepository;
import com.inv_man_sys.inv_man_sys.Repository.UserRepository;

import jakarta.servlet.http.HttpServletRequest;

public class HomeController {
   
    @Autowired
    InvoiceRepository invoiceRepo;

    @Autowired
    UserRepository userRepo;

    @RequestMapping("/invoices")
    public String invoices(ModelMap model, Locale locale){
        model.addAttribute("pageTitle", "Invocies");
        model.addAttribute("invoices", invoiceRepo.findAll());
        return "invoices";
    }
    
    @RequestMapping("/invoices/{id}")
    public String searchForInvoice(@PathVariable(value="id") Long id, ModelMap model) throws Exception{
        if(id == null){
            throw new Exception("Invoice not found");
        }
        model.addAttribute("pageTitle", "Invoice");
        model.addAttribute("invoice", invoiceRepo.findById(id));
        return "invoice";
    }

    @RequestMapping("/users")
    public String users(ModelMap model, Locale locale){
        model.addAttribute("pageTitle", "Users");
        return "users";
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(HttpServletRequest ra, Exception e, ModelMap model){
        model.addAttribute("errorMessage", e.getMessage());
        return "exceptionHandler";
    }

}
