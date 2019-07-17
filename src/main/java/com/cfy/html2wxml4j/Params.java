package com.cfy.html2wxml4j;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Params {
	public static final String TYPE_HTML = "html";
	public static final String TYPE_MD = "md";
	public static final String TYPE_MARKDOWN = "markdown";
	private String type;// 类型 html markdown md
	private Boolean highlight;// 是否开启pre代码高亮
	private Boolean linenums;// 是否开启显示pre代码行号
	private String baseUri;// 超链接或者图片的根URL
	private String text;// 需要转换的html
}
