package com.cfy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONArray;
import com.cfy.html2wxml4j.HtmlToJson;
import com.cfy.html2wxml4j.Params;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTest {

	@Test
	public void test() {
		//把html转换成JsonArray
		String html="<div style=\"sss\" id=\"b\">cccccc<pre class=\"a\"><script src=\"script.js\">scripot</script> <link href=\"c.css\"></link></pre></div>";
		Params params = getParams();
		JSONArray resultJson = HtmlToJson.by(html,params).get();
		System.out.println(resultJson);
	}

	
	
	private Params getParams(){
		
		//这里因为需要适配html2wxml前端小程序 所以只能这么写
		//拿到html2wxml组件版源码可以自行修改传递参数包装起来传递{"params":params}
		Params params=new Params();
		params.setHighlight(true);
		params.setLinenums(true);
		params.setType("html");//类型 默认HMTL
//			params.setBaseUri(baseUri);
		return params;
	}
}