package org.company.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class Web {
    private Web(){}
    public static String sendRequestByGet(String requestAddress) throws IOException {
        URL url = new URL(requestAddress);
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        int ascii = inputStreamReader.read();
        String content = "";
        while (ascii != -1){
            content += (char) ascii;
            ascii = inputStreamReader.read();
        }
        inputStreamReader.close();
        inputStream.close();
        return content;
    }
}
