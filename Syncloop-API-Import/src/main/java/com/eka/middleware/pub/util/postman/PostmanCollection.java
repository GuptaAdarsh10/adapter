package com.eka.middleware.pub.util.postman;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class PostmanCollection {

	private Map<String, Object> info;
	private List<PostmanItems> item;
	private PostmanItemAuth auth;

}
