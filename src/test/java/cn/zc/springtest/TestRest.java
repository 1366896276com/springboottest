package cn.zc.springtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.junit.Test;

public class TestRest {
	@Test
	public void test1() throws Exception {
		String targetURL = "http://localhost:8081";

		long begin=System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			request(targetURL);
		}
		long end=System.currentTimeMillis();
		
		long span=end-begin;
		
		String result=String.format("调用总时间：%d,平均时间：%d",span,span/1000);
		
		System.out.println(result);
	}

	private void request(String strurl) throws Exception {
		URL url = new URL(strurl);
		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

		httpConnection.setRequestMethod("GET");
		httpConnection.setRequestProperty("Accept", "application/json");

		if (httpConnection.getResponseCode() != 200) {
			throw new RuntimeException("HTTP GET Request Failed with Error code : " + httpConnection.getResponseCode());
		}
		BufferedReader responseBuffer = new BufferedReader(new InputStreamReader((httpConnection.getInputStream())));

		String output;
		System.out.println("Output from Server:  \n");

		while ((output = responseBuffer.readLine()) != null) {
			System.out.println(output);
		}

		httpConnection.disconnect();

	}
}
