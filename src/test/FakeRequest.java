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

public class FakeRequest {
	
	private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.75 Safari/537.36";


	private static final String POST_URL = "https://stackoverflow.com/posts/21405096/vote/2";


	public static void main(String[] args) throws IOException {
		sendPOST();
	}
	
	private static void sendPOST() throws IOException {
		URL obj = new URL(POST_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("POST");
		
		con.setRequestProperty("accept", "application/json, text/javascript, */*; q=0.01");
		con.setRequestProperty("accept-encoding", "gzip, deflate, br");
		con.setRequestProperty("accept-language", "vi-VN,vi;q=0.9,fr-FR;q=0.8,fr;q=0.7,en-US;q=0.6,en;q=0.5");
		con.setRequestProperty("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
		con.setRequestProperty("cookie", "prov=2b88c6d4-8394-cf1a-ceca-98c140445169; __qca=P0-1037316477-1508125561813; cc=ba34e2dc9955490ea169e5fc6979a328; uc=54ddf175-1369-4f1a-8d65-f6974fd8e809; _gat=1; _gat_pageData=1; acct=t=v%2feJhq1DtyjseiPVSoWROA9GHfUIVxkZ&s=nlkhmZI07AEbd6jpFZAuQNjPWEgIP7d7; _ga=GA1.2.570190114.1508125561; _gid=GA1.2.460096584.1509941998");
		con.setRequestProperty("origin", "https://stackoverflow.com");
		con.setRequestProperty("referer", "https://stackoverflow.com/questions/21404252/post-request-send-json-data-java-httpurlconnection");
		con.setRequestProperty("x-requested-with", "XMLHttpRequest");
		con.setRequestProperty("user-agent", USER_AGENT);
		
		// For POST only - START
		con.setDoOutput(true);
		OutputStream os = con.getOutputStream();
		String json = "fkey=00b77763419585cafc83dc46c0d5d573";
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
