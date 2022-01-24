package org.comstudy21.Ch08.Json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;

public class TestJsonObj2Read {

	public TestJsonObj2Read() throws FileNotFoundException {
		// InputStream is = this.getClass().getResourceAsStream("members.json");
		FileInputStream is = new FileInputStream("C:\\Users\\adoni\\Desktop\\members.json");
		JSONTokener tk = new JSONTokener(is);
		JSONObject jobj = new JSONObject(tk);

		System.out.println(jobj.toString(2));
	}

	public static void main(String[] args) throws FileNotFoundException {
		new TestJsonObj2Read();

	}

}
