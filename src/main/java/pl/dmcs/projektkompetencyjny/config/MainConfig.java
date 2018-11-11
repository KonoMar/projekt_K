package pl.dmcs.projektkompetencyjny.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import pl.dmcs.projektkompetencyjny.domain.Knight;
import pl.dmcs.projektkompetencyjny.domain.Quest;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
//@PropertySource("classpath:castle.properties")
public class MainConfig {


    @Autowired
    Quest quest;

    @Bean(name = "lancelot")
    @Primary
    public Knight lancelot(){
        Knight lancelot = new Knight("Lancelot",29);
        lancelot.setQuest(quest);
        return lancelot;
    }

    @Bean(name = "percival")
    public Knight percival(){
        Knight percival = new Knight("Percival",25);
        percival.setQuest(quest);
        return percival;
    }
//    @Bean(value = "zamek", initMethod = "build", destroyMethod = "tearDown")
//    @Value("${my.castle.name:East Watch}")
//    public Castle castle(String name){
//        Castle castle = new Castle(knight());
//        castle.setName(name);
//
//        return castle;
//    }
}
