package com.nanolaba.test_data_generator.names.russian;

import com.nanolaba.test_data_generator.names.NameGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RussianNameGenerator implements NameGenerator {

    public static final Random RANDOM = new SecureRandom();

    private String[] maleF;
    private String[] maleI;
    private String[] maleO;
    private String[] femaleF;
    private String[] femaleI;
    private String[] femaleO;

    public RussianNameGenerator() {
        this(
                readArray("default_male_f.txt"),
                readArray("default_male_i.txt"),
                readArray("default_male_o.txt"),
                readArray("default_female_f.txt"),
                readArray("default_female_i.txt"),
                readArray("default_female_o.txt")
        );
    }

    public RussianNameGenerator(String[] maleF, String[] maleI, String[] maleO,
                                String[] femaleF, String[] femaleI, String[] femaleO) {
        this.maleF = maleF;
        this.maleI = maleI;
        this.maleO = maleO;
        this.femaleF = femaleF;
        this.femaleI = femaleI;
        this.femaleO = femaleO;
    }

    public RussianName getRandomName() {
        return RANDOM.nextBoolean() ? getRandomMaleName() : getRandomFemaleName();
    }

    public RussianName getRandomMaleName() {
        return new RussianName(getRandomMaleF(), getRandomMaleI(), getRandomMaleO());
    }

    public RussianName getRandomFemaleName() {
        return new RussianName(getRandomFemaleF(), getRandomFemaleI(), getRandomFemaleO());
    }

    public String getRandomMaleF() {
        return maleF[RANDOM.nextInt(maleF.length)];
    }

    public String getRandomMaleI() {
        return maleI[RANDOM.nextInt(maleI.length)];
    }

    public String getRandomMaleO() {
        return maleO[RANDOM.nextInt(maleO.length)];
    }

    public String getRandomFemaleF() {
        return femaleF[RANDOM.nextInt(femaleF.length)];
    }

    public String getRandomFemaleI() {
        return femaleI[RANDOM.nextInt(femaleI.length)];
    }

    public String getRandomFemaleO() {
        return femaleO[RANDOM.nextInt(femaleO.length)];
    }

    public String[] getMaleF() {
        return maleF;
    }

    public String[] getMaleI() {
        return maleI;
    }

    public String[] getMaleO() {
        return maleO;
    }

    public String[] getFemaleF() {
        return femaleF;
    }

    public String[] getFemaleI() {
        return femaleI;
    }

    public String[] getFemaleO() {
        return femaleO;
    }

    private static String[] readArray(String fileName) {
        try (InputStream is = RussianNameGenerator.class.getResourceAsStream(fileName)) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
                List<String> res = new LinkedList<String>();
                String line;
                while ((line = reader.readLine()) != null) {
                    res.add(line.trim());
                }
                return res.toArray(new String[0]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
