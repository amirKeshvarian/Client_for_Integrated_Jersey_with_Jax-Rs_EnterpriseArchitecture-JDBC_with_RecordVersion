package org.company;

import org.company.gateway.API;
import org.company.http.Web;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner scanner = new Scanner(System.in);
        String jsonResponse = Web.sendRequestByGet(String.format(API.SAVE_PERSON
                ,scanner.nextLine()
                ,scanner.nextLine()
                ,scanner.nextLine()));
        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(jsonResponse);
        for (Object o : jsonArray) {
            JSONObject jsonObject = (JSONObject) o;
            System.out.println(jsonObject.get("personId"));
            System.out.println(jsonObject.get("name"));
            System.out.println(jsonObject.get("family"));
            System.out.println(jsonObject.get("salary"));
            System.out.println(jsonObject.get("recordVersion"));
        }
    }
}
