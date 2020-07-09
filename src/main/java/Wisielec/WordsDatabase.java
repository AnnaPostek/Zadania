package Wisielec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordsDatabase {

    private Random random = new Random();
    private final String[] haslo = {
            "kot", "pies", "żółw", "ptak", "kura", "wrona", "tata i mama", "jasio i ola"
    };


    public String getRandomWord() {
        int randomIndex = random.nextInt(haslo.length);
        return haslo[randomIndex];
    }
}

