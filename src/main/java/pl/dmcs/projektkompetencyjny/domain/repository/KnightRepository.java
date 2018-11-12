package pl.dmcs.projektkompetencyjny.domain.repository;

import pl.dmcs.projektkompetencyjny.domain.Knight;

import java.util.Collection;

public interface KnightRepository {

    void createKnight(String name, int age);

    Collection<Knight> getAllKnights();

    Knight getKnight(String name);

    void deleteKnight(String name);

    void build();
}
