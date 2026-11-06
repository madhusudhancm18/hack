package test1.test1;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class ReadJSON {

    public static void main(String[] args) throws Exception {

        JSONParser parser = new JSONParser();

        Object obj = parser.parse(new FileReader("student.json"));

        JSONObject student = (JSONObject) obj;

        System.out.println("First Name: " + student.get("fname"));
        System.out.println("Last Name: " + student.get("lname"));
    }
}
