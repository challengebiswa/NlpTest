package com.nlp.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NlpTestGoogle {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://api.dialogflow.com/v1/intents?v=20150910");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Authorization", "Bearer 78129a0681a745d486541e77509bcdef");
	
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
