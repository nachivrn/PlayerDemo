package com.playersDemo;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.playersDemo.domain.Player;
import com.playersDemo.repo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;

@Component
class PlayerServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public void run(String... args) throws Exception {
        CsvSchema bootstrapSchema = CsvSchema.emptySchema().withHeader();
        CsvMapper mapper = new CsvMapper();
        File file = new ClassPathResource("People.csv").getFile();
        MappingIterator<Player> readValues =
                mapper.reader(Player.class).with(bootstrapSchema).readValues(file);
        List<Player> players = readValues.readAll();
        playerRepository.saveAll(players);
    }
}