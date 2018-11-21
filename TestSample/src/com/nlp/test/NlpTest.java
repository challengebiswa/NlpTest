package com.nlp.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NlpTest {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://api.wit.ai/entities?v=20170307");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Authorization", "Bearer VL2TTOVWAD5UEW5XNGM4Z7X2BRQZAMDT");
	
		BufferedReader in = new BufferedReader(
				  new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer content = new StringBuffer();
				while ((inputLine = in.readLine()) != null) {
				    content.append(inputLine);
				}
				in.close();
				
				System.out.println(content.toString());
	}
}
