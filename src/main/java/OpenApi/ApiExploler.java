package OpenApi;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ApiExploler {
        public static void main(String[] args) throws IOException {
            StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/3040000/smokingService/getSmkAreaList"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=y07RSjG0hUivy3QAJEf6/Px3CX2iCP5pVOE04aI5dXAfuPpkTIIGCqiK0aGOVQ949jBu9ciwQv0cll7B3NQzrw=="); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*응답메시지 결과 요청 타입(xml, json, geojson)*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("id","UTF-8") + "=" + URLEncoder.encode("군자동-02-01-020", "UTF-8")); /*흡연구역 아이디*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-type", "application/json");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
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


            JSONObject response = new JSONObject(sb.toString());
            JSONArray items = response.getJSONObject("response").getJSONObject("body").getJSONArray("items");

            // 위도와 경도 추출하여 Coordinates 클래스에 담기
            Coordinates coordinates = new Coordinates();
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                double latitude = item.getDouble("위도");
                double longitude = item.getDouble("경도");
                coordinates.addCoordinate(latitude, longitude);
            }

            // Coordinates 클래스의 데이터 출력
            System.out.println("Coordinates:");
            for (Coordinate coordinate : coordinates.getCoordinates()) {
                System.out.println("Latitude: " + coordinate.getLatitude() + ", Longitude: " + coordinate.getLongitude());
            }
        }
}

class Coordinates {
    private List<Coordinate> coordinates;

    public Coordinates() {
        coordinates = new ArrayList<>();
    }

    public void addCoordinate(double latitude, double longitude) {
        coordinates.add(new Coordinate(latitude, longitude));
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }
}

class Coordinate {
    private double latitude;
    private double longitude;

    public Coordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
