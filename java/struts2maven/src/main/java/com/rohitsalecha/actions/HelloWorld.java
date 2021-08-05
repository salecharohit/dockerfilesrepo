package com.rohitsalecha.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@ResultPath(value = "/")
public class HelloWorld extends ActionSupport {

   private static final long serialVersionUID = 1L;
   private String message;
   private String name;

   @Action(value = "HelloWorld", results = { @Result(name = "result", location = "/success.jsp") })
   public String execute() {
      setMessage("Hello " + getName());
      return "result";
   }

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

}