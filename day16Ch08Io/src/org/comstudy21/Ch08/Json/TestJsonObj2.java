package org.comstudy21.Ch08.Json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class TestJsonObj2 {

	public static void main(String[] args) throws IOException {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("no", "1");
		jsonObj.put("name", "kim");
		jsonObj.put("email", "kim@korea.com");
		JSONObject jsonObj02 = new JSONObject();
		jsonObj02.put("no", "2");
		jsonObj02.put("name", "lee");
		jsonObj02.put("email", "lee@korea.com");
		JSONObject jsonObj03 = new JSONObject();
		jsonObj03.put("no", "3");
		jsonObj03.put("name", "park");
		jsonObj03.put("email", "park@korea.com");

		JSONArray jArr = new JSONArray();
		jArr.put(jsonObj);
		jArr.put(jsonObj02); 
		jArr.put(jsonObj03);
//	        System.out.println(jArr.toString(1));

		// 만들어진 JSONObject 데이터를 파일에 기록하기
		JSONObject rootObj = new JSONObject();
		rootObj.put("members", jArr);

		// 파일에 기록
		// realpath 에 저장
		FileWriter writer = new FileWriter("C:\\Users\\adoni\\Desktop\\members.json");
		writer.write(rootObj.toString(2));
		writer.close();

	}
}
