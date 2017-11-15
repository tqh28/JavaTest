package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.binary.Base64;

public class JavaURL {

	private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.75 Safari/537.36";

	private static final String GET_URL = "http://localhost:8080";

	private static final String POST_URL = "http://localhost:8080/insertRoom";

	private static final String POST_PARAMS = "userName=Pankaj";

	public static void main(String[] args) throws IOException {
		sendGET();
		System.out.println("GET DONE\n");
		sendPOST();
		System.out.println("POST DONE");
	}

	private static void sendGET() throws IOException {
		URL obj = new URL(GET_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		
		String userCredentials = "user:user";
		String basicAuth = "Basic " + new String(Base64.encodeBase64(userCredentials.getBytes()));
		con.setRequestProperty ("Authorization", basicAuth);
//		con.setRequestProperty("Cookie", "JSESSIONID=20C7746242BE0673360D296C358F9AC5");
		
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		Map<String, List<String>>  map = con.getHeaderFields();
		Set<String> set = map.keySet();
		for (String s: set) {
			List<String> list = map.get(s);
			System.out.print(s + ": ");
			for (String s2: list) {
				System.out.print(s2);
			}
			System.out.println();
		}
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());
		} else {
			System.out.println("GET request not worked");
		}

	}

	private static void sendPOST() throws IOException {
		URL obj = new URL(POST_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		
		String userCredentials = "user:user";
		String basicAuth = "Basic " + new String(Base64.encodeBase64(userCredentials.getBytes()));
		con.setRequestProperty ("Authorization", basicAuth);
//		con.setRequestProperty("Cookie", "io=9WcwE_DQfEC2pOHiAADa; JSESSIONID=F4AE698C6E2B2F5B307C7FBB62233D17");

		// For POST only - START
		con.setDoOutput(true);
		OutputStream os = con.getOutputStream();
		String json = "data={\"name\":\"Han bang than chuong\",\"managerId\":3}";
		os.write(json.getBytes("UTF-8"));
		os.flush();
		os.close();
		// For POST only - END

		int responseCode = con.getResponseCode();
		System.out.println("POST Response Code :: " + responseCode);
		Map<String, List<String>>  map = con.getHeaderFields();
		Set<String> set = map.keySet();
		for (String s: set) {
			List<String> list = map.get(s);
			System.out.print(s + ": ");
			for (String s2: list) {
				System.out.print(s2);
			}
			System.out.println();
		}

		if (responseCode == HttpURLConnection.HTTP_OK) { //success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());
		} else {
			System.out.println("POST request not worked");
		}
	}
}
