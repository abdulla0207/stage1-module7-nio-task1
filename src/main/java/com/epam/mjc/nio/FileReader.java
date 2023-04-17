package com.epam.mjc.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileReader {

    public Profile getDataFromFile(File file) {
        Profile profile = new Profile();
        String inString = "";
        List<String> words = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(file))){
            while ((inString = reader.readLine()) != null){
                String[] s = inString.split(" ");
                words.add(s[0]);
                words.add(s[1]);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        profile.setName(words.get(1));
        profile.setAge(Integer.parseInt(words.get(3)));
        profile.setEmail(words.get(5));
        profile.setPhone(Long.parseLong(words.get(7)));
        return profile;
    }
}
