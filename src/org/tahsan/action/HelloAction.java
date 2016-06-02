package org.tahsan.action;


import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {

    String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String execute() throws Exception {

        greeting = "Hello Struts 2";
        System.out.println(greeting);
        return "success";
    }
}
