package ch.tbz.m320;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test {

    @org.junit.jupiter.api.Test
    public void testApprenticeName() {
        String expectedName = "Knee";


        Apprentice apprentice = new Apprentice("Programming", "Knee");

        String actualName = apprentice.getName();

        assertEquals(expectedName, actualName);
    }

}