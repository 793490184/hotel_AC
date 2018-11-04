package com.InitLee.hotel_CA.controller;

import com.InitLee.hotel_CA.serviceImpl.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private UserService userService;

    @Resource
    private UserService userService;

    @RequestMapping("/add_user.do")
    @ResponseBody
    public Result addUser(String name, String password) {
        return null;
    }

	@RequestMapping("/register.do")
	@ResponseBody
	public Result register(String name, String password) throws IOException {

		System.out.println("name：" + name);
		System.out.println("password:" + password);
		userService.register(name, password);
		// System.out.println("register()");
		return new Result("success");
		// return JSON.toJSONString("OK");
	}

	@RequestMapping("/login.do")
	@ResponseBody
//	public Result login(HttpServletRequest request) throws IOException {
	public Result login(String name, String password) throws IOException {
//    	String data = HttpUtil.charReader(request);
//		System.out.println(data);
		System.out.println("name：" + name);
		System.out.println("password:" + password);
		// System.out.println("register()");
		if (name.equals("name") && password.equals("pass"))
			return new Result("success");
		else
			return new Result(0,"error");
		// return new Result("success");
	}

	@Test
	public void fun() {
    	String post = "name=sdfg&password=ssdfg";
    	Map<String, String> map = new HashMap<>();
    	List<String> data = Arrays.asList(post.split("&"));
    	int length = data.size();
		for (int i = 0; i < length; i++) {
			String[] str = data.get(i).split("=");
			map.put(str[0], str[1]);
		}
		System.out.println(map);
	}

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    // @ResponseBody
    public String registerPage(String username, String password) {


        //return new Result("success");
        // return "register";
        // response.sendRedirect(request.getContextPath()+"/register.html");
        return "register";
    }

    /*
    @RequestMapping("/user")
    public void emps(Map<String, Object> map){
        System.out.println("111");
        List<User> emps = userService.getEmps();
        System.out.println("222");
        System.out.println(emps);
        map.put("allEmps",emps);
        //return "list";

    }

    @Test
    public void test(){
        System.out.println("111");
        System.out.println(userService.say());
        //List<Employee> emps = employeeService.getEmps();
        //System.out.println("222");
        //System.out.println(emps);
    }
    */
}
