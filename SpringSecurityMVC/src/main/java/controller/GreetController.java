package controller;

import daocustomer.CustomerDaoImpl;
import model.Customer;
import model.Loan;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import service.DaoServiceImpl;
import service.DateEditor;

import java.time.LocalDate;
import java.util.List;

public class GreetController {
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder)
    {
        webDataBinder.registerCustomEditor(LocalDate.class,"dateOfBirth",new DateEditor ());
        webDataBinder.registerCustomEditor(LocalDate.class,"InstallmentDueDate",new DateEditor());
        webDataBinder.registerCustomEditor(LocalDate.class,"AgreementDate",new DateEditor());
    }
    //here we are register details of customer by registration form
    @RequestMapping("Ques2")
    public String customer(@ModelAttribute("customer") Customer customer)
    {
        return "registrationform";
    }

    Customer customerobj= null;
    DaoServiceImpl daoService= new DaoServiceImpl();
    @RequestMapping("process")
    public String Customer(@ModelAttribute("customer") Customer customer, @ModelAttribute("loan") Loan loan)
    {
        customerobj=customer;
        daoService.registerCustomer(customerobj);
//        daoService.updateCustomer(customerobj);
        System.out.println(customerobj.getFullname());
        return "Loanform";
    }

    @RequestMapping("loanProcess")
    public String Loan(@ModelAttribute("customer") Customer customer, @ModelAttribute("loan") Loan loan , String submit)
    {
        String name =customerobj.getFullname();
        int house=customerobj.getHouseNo();
        int id=daoService.getCustomerId(name,house);
        loan.setCustomerId(id);
        System.out.println(id);
        if(submit.equals("Add"))
        {
            customerobj.setLoan(loan);
            System.out.println(customerobj.getLoan().size());
            return "redirect:/nested";
        }
        else if(submit.equals("Process"))
        {
            customerobj.setLoan(loan);
            daoService.insertLoan(customerobj.getLoan());
            return "success";
        }
        return null;
    }

    @RequestMapping("nested")
    public String nested( @ModelAttribute("loan") Loan loan)
    {
        return "Loanform";
    }
    @RequestMapping("/admin")
    public String adminPage(Authentication authentication)
    {
        System.out.println(authentication.getName());
        System.out.println(authentication.getAuthorities().toString());
        return "admin-dashboard";
    }

    @RequestMapping("/user")
    public String userPage()
    {
        return "user-dashboard";
    }


    @RequestMapping("/adminprocess")
    public String adminprocess(String submit, Model model)
    {
        List<Customer> list=null;
        CustomerDaoImpl customerDao= new CustomerDaoImpl();
        if(submit.equals("DELETE"))
        {
            return  "deletecust";
        }
        if(submit.equals("VIEW")) {

            list=customerDao.getAllCustomers();
            model.addAttribute("listCustomer",list);
            return "printCustomer";
        }
        if(submit.equals("UPDATE"))
        {
            return "forward:/Ques2";
        }
        return null;
    }

    @RequestMapping("/userprocess")
    public String userprocess(String submit, Model model)
    {
        List<Customer> list=null;
        CustomerDaoImpl customerDao= new CustomerDaoImpl();
        if(submit.equals("ADD"))
        {
            return  "forward:/Ques2";
        }
        if(submit.equals("VIEW")) {

            list=customerDao.getAllCustomers();
            System.out.println(list.size());
            model.addAttribute("listCustomer",list);
            return "printCustomer";
        }
        return null;
    }
    @RequestMapping("/delete.jsp")
    public void deleteCustomer(int id)
    {
        CustomerDaoImpl customerDao= new CustomerDaoImpl();
        customerDao.deleteCustomer(id);
    }
}
