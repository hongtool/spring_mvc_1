package com.springmvc.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

//默认bean的id为首字母小写的类名
@Component
public class MyView implements View {

	//告知spring容器，contentType
	@Override
	public String getContentType() {
		return "text/html";
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.getWriter().println("<h2>This is my view!</h2>");
	}

}
