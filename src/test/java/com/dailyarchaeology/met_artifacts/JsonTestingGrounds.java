package com.dailyarchaeology.met_artifacts;

import java.util.Map;

import org.assertj.core.api.Assertions;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class JsonTestingGrounds {
	
	private final String simpleJsonString = "{ \"Name\": \"Greg Smith\", \"Age\": 42 }";
	
	private class SimplePojo {
		private String name;
		private Integer age;
		
		public SimplePojo() {};
	
		public SimplePojo(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "SimplePojo [name=" + name + ", age=" + age + "]";
		}
	}
	
	@Test
	public void doesThisWork() throws JsonMappingException, JsonProcessingException {
		SimplePojo pojo = new SimplePojo();
		JsonParser parser = JsonParserFactory.getJsonParser();
		Map<String, Object> simpleMap = parser.parseMap(simpleJsonString);
		pojo.setName((String) simpleMap.get("Name"));
		pojo.setAge((Integer) simpleMap.get("Age"));
		Assertions.assertThat(pojo).isNotNull();
		Assertions.assertThat(pojo.getName()).isEqualTo("Greg Smith");
		Assertions.assertThat(pojo.getAge()).isEqualTo(42);
	}
}
