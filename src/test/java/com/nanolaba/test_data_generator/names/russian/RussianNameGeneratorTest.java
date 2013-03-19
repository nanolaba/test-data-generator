package com.nanolaba.test_data_generator.names.russian;

import junit.framework.Assert;
import org.junit.Test;

public class RussianNameGeneratorTest {

    @Test
    public void testGetRandomName() {
        RussianNameGenerator nameGenerator = new RussianNameGenerator();

        for (int i = 0; i < 100; ++i) {
            RussianName randomName = nameGenerator.getRandomName();
            Assert.assertNotNull(randomName);
            Assert.assertNotNull(randomName.getF());
            Assert.assertNotNull(randomName.getI());
            Assert.assertNotNull(randomName.getO());
            Assert.assertNotNull(randomName.getIOF());
            Assert.assertNotNull(randomName.getFIO());
            Assert.assertNotNull(randomName.getIO());
            Assert.assertNotNull(randomName.getName());

            System.out.println(randomName.getName());
        }
    }
}
