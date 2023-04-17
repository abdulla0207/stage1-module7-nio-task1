package com.epam.mjc.nio;

import java.io.File;

public class Read {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        fileReader.getDataFromFile(new File("src/main/resources/Profile.txt"));
    }
}
