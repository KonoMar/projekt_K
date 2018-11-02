package pl.dmcs.projektkompetencyjny.domain;

import org.junit.Test;
import pl.dmcs.projektkompetencyjny.domain.Castle;
import pl.dmcs.projektkompetencyjny.domain.Knight;

import static junit.framework.TestCase.assertEquals;

public class CastleTest {

    @Test
    public void castleToStringMessage() {
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle(knight,"East Watch");
        String except = "Znajduje sie tu zamek o nazwie East Watch. Zamieszkały przez rycerzaRycerz o imieniu Lancelot ( 29 ). Ma za zadanie Uratuj księżniczkę!";
        assertEquals(except, castle.toString());


    }
}
