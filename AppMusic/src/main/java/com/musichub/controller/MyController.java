package com.musichub.controller;



import java.io.BufferedOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.security.Principal;
import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.musichub.DAO.UserDAOService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMailMessage;

import com.musichub.model.*;

@Controller
public class MyController {
	@Autowired
	UserDAOService uds;
	
	//private JavaMailSender mailSender;
	
	/*@Autowired
	public void setJavaMailSender(JavaMailSender mailSender)
	{
		this.mailSender=mailSender;
	}*/
	//@Autowired
	  //private JavaMailSenderImpl mailSender;

	@Autowired
	public MyController(UserDAOService ud)
	{
		this.uds=ud;
		
		
		
	}
	
	@RequestMapping("/")
	public String hello()
	{
		System.out.println("index");
		return "Index";
	}
	@RequestMapping("/Login")
	   public String login(@RequestParam (value="error", required = false) String error,
	                       @RequestParam (value="logout", required = false) String logout, Model model)
	{

	       if(error != null) {
	           model.addAttribute("error", "Invalid username and password!");
	       }

	       if(logout!= null) {
	           model.addAttribute("msg", "You have been logged out successfully.");
	       }

	       return "Login";
	   }
	
	@RequestMapping(value="/Home", method = RequestMethod.GET)
	public ModelAndView printWelcome(Principal principal,HttpServletRequest request ) {
	 
	String name = principal.getName();

	System.out.println(name);
   
    if(request.isUserInRole("ROLE_ADMIN"))
    {
    	System.out.println(request.isUserInRole("ROLE_ADMIN"));
    	System.out.println("Admin page");
    	return new ModelAndView("AdminHome","username",name);
    }
    else
    {
    	System.out.println(request.isUserInRole("ROLE_USER"));
    	System.out.println("user page");
    	//model.addAttribute("username", name);
    	return new ModelAndView("UserHome","username",name);
    }
     
	}

	@RequestMapping("/Contact")
	public String contact()
	{
		return "Contact";
	}
	

	@RequestMapping("/Registration")
	public String registration()
	{
		System.out.println("registration form");
		return "Registration";
	}
	@ModelAttribute("user")
	public User construct()
	{
		return new User();
	}
	@RequestMapping(value="/u_register",method=RequestMethod.POST)
	public String doRegister(@ModelAttribute("user") User user)
	{
		System.out.println(user.getUsername());
	
	    uds.save(user);	
		return "UserHome";
	}
	
	
	@RequestMapping("admin/productdetails")
	public String listproduct(Model m)
	{
		System.out.println("product page");
		m.addAttribute("product",new Product());
	    System.out.println("return data");
			m.addAttribute("listproduct",uds.listProducts());
			System.out.println("fetch data");
		return "productdetails";
	}
	@ModelAttribute("product")
	public Product consp()
	{
		return new Product();
	}
	@RequestMapping(value= "admin/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("product") Product p,HttpServletRequest request){
		System.out.println("inside add");
		System.out.println(p.getID());
		System.out.println(p.getName());
		
	  if(p.getID()==0)
		{
		Product pp=this.uds.lastproductid();
		System.out.println(pp.getID());
		
         //System.out.println(p.getID());
         
		String filename=null;
		ServletContext sc=request.getServletContext();
		
		String path=sc.getRealPath("./resource/pr"+(pp.getID()+1)+".jpg");
		System.out.println("Path:"+path);
		System.out.println(p.getName());
		System.out.println(p.getDescription());
		System.out.println("file Name="+p.getImage().getOriginalFilename());
		File f=new File(path);
		if(!p.getImage().isEmpty())
		{
			try{
				
				byte[] bytes=p.getImage().getBytes();
				
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f));
				
				bos.write(bytes);
				
				bos.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		 this.uds.addProduct(p);
		
          
		}
        else{
        	ServletContext sc1=request.getServletContext();
    		
    		String path=sc1.getRealPath("./resource/pr"+(p.getID())+".jpg");
    		System.out.println("Path:"+path);
    		System.out.println("file Name="+p.getImage().getOriginalFilename());
    		File f1=new File(path);
    		if(!p.getImage().isEmpty())
    		{
    			try{
    				
    				byte[] bytes=p.getImage().getBytes();
    				
    				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f1));
    				
    				bos.write(bytes);
    				
    				bos.close();
    			}
    			catch(Exception e)
    			{
    				System.out.println(e.getMessage());
    			}
    		}
        	this.uds.updateProduct(p);//Product(p);
        	
        }
         
        return "redirect:admin/productdetails";
         
    }
	

	@RequestMapping("admin/remove/{id}")
    public String deleteProduct(@PathVariable("id") int id)
	{
         System.out.println(id);
        this.uds.deleteProduct(id);
        return "redirect:admin/productdetails";
    }
  
   
	@RequestMapping("admin/edit/{id}")
    public ModelAndView editProduct(@PathVariable("id") int id){
		
    	ModelAndView o=new  ModelAndView("admin/productdetails");
    	
    	Product p=this.uds.getProductById(id);
    	
    	o.addObject("product",p);
        o.addObject("listproduct", this.uds.listProducts());
      
		return o;
    }
	
	//*************USER PAGE**********************************
	
	@RequestMapping("/user/sendmail")
	public String  mail(Principal principal)
	{
	   
		return "EmailForm";
		
	}
	@RequestMapping("/user/doSendMail")
    public String doMail(Principal principal,HttpServletRequest request)
	{
		
		
		try
		{
		String recipientAddress = request.getParameter("recipient");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
		
		// prints debug info
		System.out.println("To: " + recipientAddress);
		System.out.println("Subject: " + subject);
		System.out.println("Message: " + message);
		
		// creates a simple e-mail object
		//SimpleMailMessage email = new SimpleMailMessage();
		//SimpleMailMessage email = new SimpleMailMessage();
		//email.setTo(recipientAddress);
		//email.setSubject(subject);
		//email.setText(message);
		
		// sends the e-mail
		//mailSender.send(email);
		
		
		}
		catch(Exception ex)
		{
			System.out.println("Exception = "+ex);
		}
		return "Success";
        
        
	}
	@RequestMapping("/user/userproduct")
	public String userproduct(Model m,Principal principal)
	{
		m.addAttribute("listproduct",uds.listProducts());
		System.out.println("fetch data");
		String name = principal.getName();
		m.addAttribute("username",name);
		return "userproduct";
		
	}
	@RequestMapping("/user/show/{id}")
    public String showProduct(@PathVariable("id") int id,Model m)
	{
         System.out.println(id);
         Product p=this.uds.getProductById(id);
         m.addAttribute("prod_id",p);
		return "productpage";
    }
	
	@RequestMapping("/user/show/addCart")
	 public String addToCart()
    {
		Product p=new Product();
		
		System.out.println("aaa");
        return "redirect:checkout";
    }


}

