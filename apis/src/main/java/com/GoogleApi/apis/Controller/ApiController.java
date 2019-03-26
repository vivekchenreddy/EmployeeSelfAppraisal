package com.GoogleApi.apis.Controller;
import com.GoogleApi.apis.Dto1;
import com.GoogleApi.apis.model.Note;
import com.GoogleApi.apis.repository.NoteRepository;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
/*
This is a controller that implements google authentication to the webapp. In this method when the google login
button is clicked on the webpage frontend a token is generated and through routing is sent to the backend,which in turn is
decoded when using URI and http GET request. Then the response is extracted using Json parser.

 */




@CrossOrigin
@Controller
public class ApiController {

    @Autowired
    NoteRepository noteRepository;
    @ResponseBody
    @PostMapping("/token")
    public Dto1 hfhfhfhhf(@RequestBody String tokenId) throws GeneralSecurityException, IOException, ParseException {
        CloseableHttpClient client = HttpClients.createDefault();
        String newIdToken = tokenId.substring(8);

        //SENDIND THE TOKEN TO GOOGLE IN ORDER TO DECRYPT IT
        HttpGet request = new HttpGet("https://www.googleapis.com/oauth2/v3/tokeninfo?id_token=" + newIdToken);

        CloseableHttpResponse response = null;
        response = client.execute(request);
        int status = response.getStatusLine().getStatusCode();

        if (!(status >= 200 && status < 300)) {
            System.out.println("Unexpected response status: " + status);
        }


        HttpEntity entity = response.getEntity();
        String responseString = EntityUtils.toString(entity, "UTF-8");
        System.out.println(responseString);


//EXTRACTING DATA FROM THE RESPONSE
        JSONObject json = (JSONObject) new JSONParser().parse(responseString);
        String email = (String) json.get("email");
        String email_verified = (String) json.get("email_verified");
        String name = (String) json.get("name");
        String unique_id = (String) json.get("sub");
        System.out.println(name);
        System.out.println(email);
        System.out.println(email_verified);
        System.out.println(unique_id);
        Dto1 dto=new Dto1();
        dto.setEmail_verified(email_verified);
        dto.setEmailid(email);
        Note note = new Note();
        note.setEmail(email);
        note.setName(name);
        note.setId(unique_id);
        noteRepository.save(note);
        dto.setName(name);
        return dto;

        /*
        Here we have a lot of information given by google while decoding,using Dto1 we can select the information
        which we want to send to the front end.
         */
    }

}


