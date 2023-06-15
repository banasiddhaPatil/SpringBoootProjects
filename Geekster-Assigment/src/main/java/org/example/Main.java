package org.example;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception{


        String urlString = "https://api.chucknorris.io/jokes/random";

        // creating a URL
        URL url = new URL(urlString);

        // Creating a connection
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Getting response code
        int responseCode = connection.getResponseCode();

//        Extracting Information from Byte Codes into JSON

//        Extracting information from BufferReader. BufferReader has data in
//        the form of packages or Byte codes after calling the API. After, we have to
//        convert that byte codes into readable data (basically into JSON format).
//        We need to create a StringBuilder and keep appending the data after converting into
//        JSON into StringBuilder.

        if(responseCode == 200){
            BufferedReader byteCodes = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder apiData = new StringBuilder();
            String readline = null;

            while((readline = byteCodes.readLine()) != null){
                apiData.append(readline);
            }

            byteCodes.close();

//            To convert String to JSON
            JSONObject jsonAPIResponse = new JSONObject(apiData.toString());

            System.out.println(jsonAPIResponse);
            System.out.println(jsonAPIResponse.get("icon_url"));
            System.out.println(jsonAPIResponse.get("updated_at"));
            System.out.println(jsonAPIResponse.get("created_at"));
            System.out.println(jsonAPIResponse.get("id"));
            System.out.println(jsonAPIResponse.get("value"));
            System.out.println(jsonAPIResponse.get("url"));
            System.out.println(jsonAPIResponse.get("categories"));
        }
        else
            System.out.println("API call could not be made!!!");


    }
}