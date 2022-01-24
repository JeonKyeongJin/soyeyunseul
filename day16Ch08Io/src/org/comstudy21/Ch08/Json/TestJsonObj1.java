package org.comstudy21.Ch08.Json;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestJsonObj1 {

	public static void main(String[] args) {
		JSONObject jsonObj = new JSONObject();
        jsonObj.put("no", "1");
        jsonObj.put("name", "kim");
        jsonObj.put("email", "kim@korea.com");

        JSONArray jArr = new JSONArray();
        jArr.put(jsonObj);
        System.out.println(jArr.toString(1));

	}

}
