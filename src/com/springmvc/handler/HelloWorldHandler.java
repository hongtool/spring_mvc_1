package com.springmvc.handler;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.pojo.Account;
import com.springmvc.pojo.User;

@Controller
@RequestMapping("/springmvc")
//@SessionAttributes(value={"city", "name"})
@SessionAttributes(types={String.class})
public class HelloWorldHandler {

	@RequestMapping(value="/hello", method=RequestMethod.GET, params={"name","age!=12"}, headers={"accept=*/*"})
	public String hello(HttpServletRequest request) {
		System.out.println(request.getParameter("name"));
		return "success";
	}
	
	@RequestMapping(value="/testPathVar/{id}")
	public String testPathVar(@PathVariable(value="id") int id) {
		System.out.println(id);
		return "success";
	}
	
	@RequestMapping(value="/testGet/{id}", method=RequestMethod.GET)
	public String testGet(@PathVariable(value="id") Integer id) {
		System.out.println("get id is " + id + " userinformation");
		return "success";
	}
	
	@RequestMapping(value="/testPost", method=RequestMethod.POST)
	public String testPost() {
		System.out.println("正在向数据库添加信息");
		return "success";
	}
	
	@RequestMapping(value="/testDelete/{id}", method=RequestMethod.DELETE)
	public String testDelete(@PathVariable(value="id") Integer id) {
		System.out.println("正在删除" + id +"的信息");
		return "success";
	}
	@RequestMapping(value="/testPut/{id}", method=RequestMethod.PUT)
	public String testPut(@PathVariable(value="id") Integer id) {
		System.out.println("正在更新" + id +"的信息");
		return "success";
	}
	
	/**
	 * 若参数名称与前端一致，可以省略@RequestParam(value=" ")
	 * @param id
	 * @param b
	 * @return
	 */
//	@RequestMapping(value="/testRequestParam", method=RequestMethod.POST)
//	public String testRequestParam(@RequestParam(value="id", required=true)Integer id, @RequestParam(value="name")String b) {
//		System.out.println(id);
//		System.out.println(b);
//		return "success";
//	}
	@RequestMapping(value="/testRequestParam", method=RequestMethod.POST)
	public String testRequestParam(User user) {
		System.out.println(user);
		return "success";
	}
	
	//获取请求报头信息
	//Accept表示前端可以接收的类型
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader("Accept") String a, @RequestHeader("User-Agent") String b) {
		System.out.println(a);
		System.out.println(b);
		return "success";
	}
	
	//获取cookie的值
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String id) {
		System.out.println(id);
		return "success";
	}
	
	@RequestMapping("/testServletAPI")
	public String testServletAPI(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request);
		System.out.println(response);
		return "success";
	}
	
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		mv.addObject("name", "Tom");
		return mv;
	}
	
	@RequestMapping("/testMap")
	public String testMap(Map<String, Object> map) {
		map.put("age", 12);
		return "success";
	}
	
	@RequestMapping("/testModel")
	public String testModel(Model model) {
		model.addAttribute("mail", "xin@qq.com");
		return "success";
	}
	
	@RequestMapping("/testModelMap")
	public String testModelMap(ModelMap modelMap) {
		modelMap.addAttribute("city", "beijing");
		return "success";
	}
	
	@RequestMapping("/result")
	public String result() {
//		modelMap.addAttribute("city", "beijing");
		return "result";
	}
	
//	@ModelAttribute
//	public void start(Map<String, Object> map) {
//		Account account = new Account(1, "Tom", "2016-1-1");
//		map.put("abc", account);
//	}
	@ModelAttribute(value="abc")
	public Account start() {
		Account account = new Account(1, "Tom", "2016-1-1");
		return account;
	}
	/**
	 * 如果key值为POJO的小写，则入参可以省略@ModelAttribute(" ")
	 * @param account
	 * @return
	 */
	@RequestMapping("/testModelAttribute")
	public String update(@ModelAttribute("abc")Account account) {
		System.out.println(account);
		return "success";
	}
	
	/*@RequestMapping("/testGlobal")
	public String testGlobal() {
		return "a";
	}*/
}
