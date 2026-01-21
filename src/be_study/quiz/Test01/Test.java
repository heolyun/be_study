package be_study.quiz.Test01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		test.execute();
	}

	// 전체 흐름 제어
	public void execute() {
		try {
			String json = callApi();
			parseAndSave(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String callApi() throws Exception {

		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8")
				+ "=4544ca138b2a5d29df68fb5f50083e5682d31ae05810445ae3d7d6197a5b95a9"); /* Service Key */
		urlBuilder
				.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("1000", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append("&" + URLEncoder.encode("dataType", "UTF-8") + "="
				+ URLEncoder.encode("JSON", "UTF-8")); /* 요청자료형식(XML/JSON) Default: XML */
		urlBuilder.append("&" + URLEncoder.encode("base_date", "UTF-8") + "="
				+ URLEncoder.encode("20260114", "UTF-8")); /* ‘21년 6월 28일발표 */
		urlBuilder.append(
				"&" + URLEncoder.encode("base_time", "UTF-8") + "=" + URLEncoder.encode("0500", "UTF-8")); /* 05시 발표 */
		urlBuilder.append(
				"&" + URLEncoder.encode("nx", "UTF-8") + "=" + URLEncoder.encode("55", "UTF-8")); /* 예보지점의 X 좌표값 */
		urlBuilder.append(
				"&" + URLEncoder.encode("ny", "UTF-8") + "=" + URLEncoder.encode("127", "UTF-8")); /* 예보지점의 Y 좌표값 */
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		System.out.println(sb.toString());
		return sb.toString();
	}

//2️ JSON 파싱 + DTO 생성 + DB 저장
	public void parseAndSave(String jsonStr) throws Exception {

	    JSONParser parser = new JSONParser();
	    JSONObject json = (JSONObject) parser.parse(jsonStr);

	    JSONObject response = (JSONObject) json.get("response");
	    JSONObject body = (JSONObject) response.get("body");
	    JSONObject items = (JSONObject) body.get("items");
	    JSONArray itemArr = (JSONArray) items.get("item");

	    VilageFcstDAO dao = new VilageFcstDAO();

	    for (Object obj : itemArr) {
	        JSONObject item = (JSONObject) obj;

	        VilageFcstDTO dto = new VilageFcstDTO();
	        dto.setBaseDate((String) item.get("baseDate"));
	        dto.setBaseTime((String) item.get("baseTime"));
	        dto.setCategory((String) item.get("category"));
	        dto.setFcstDate((String) item.get("fcstDate"));
	        dto.setFcstTime((String) item.get("fcstTime"));
	        dto.setFcstValue((String) item.get("fcstValue"));
	        dto.setNx(((Long) item.get("nx")).intValue());
	        dto.setNy(((Long) item.get("ny")).intValue());

	        dao.insert(dto);
	    }
	}
}