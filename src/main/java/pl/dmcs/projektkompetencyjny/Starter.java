package pl.dmcs.projektkompetencyjny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.dmcs.projektkompetencyjny.domain.Castle;
import pl.dmcs.projektkompetencyjny.domain.Knight;
import pl.dmcs.projektkompetencyjny.domain.Quest;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    Castle castle;


    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

//        Quest saveThePrincess = new Quest("Uratuj ksieżniczkę!");
//
//        Knight lancelot = new Knight("Lancelot",29,saveThePrincess);
//
//        System.out.println(lancelot);
//
//        Quest killTheDragon = new Quest("Zabij smoka!");
//
//        Knight pervival = new Knight("Percival",31);
//        System.out.println(pervival);
//        pervival.setQuest(killTheDragon);
//        System.out.println(pervival);
    }
}
