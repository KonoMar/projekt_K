package pl.dmcs.projektkompetencyjny.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dmcs.projektkompetencyjny.domain.Quest;
import pl.dmcs.projektkompetencyjny.domain.repository.KnightRepository;
import pl.dmcs.projektkompetencyjny.domain.repository.QuestRepository;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    //klasa bezstanowe

    @Autowired
    KnightRepository knightRepository;


    @Autowired
    QuestRepository questRepository;

    final static Random rand= new Random();

    public void assignRandomQuest(String knightName) {
        List<Quest> allQuests = questRepository.getAll();
        Quest randomQuest = allQuests.get(rand.nextInt(allQuests.size()));
        knightRepository.getKnight(knightName).setQuest(randomQuest);
        questRepository.deleteQuest(randomQuest);
    }

}
