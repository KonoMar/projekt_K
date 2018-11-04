package pl.dmcs.projektkompetencyjny.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Knight {


    private String name;

    private int age;

    private Quest quest;

    public Knight()
    {

    }

//
//    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setQuest(Quest quest) {
        System.out.println("Ustawiam zadanie dla rycerza");
        this.quest = quest;
    }

    @Override
    public String toString(){
        return "Rycerz o imieniu" + name + " ( " + age + " ). Ma za zadanie " + quest;
    }
}
