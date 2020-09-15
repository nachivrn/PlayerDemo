package com.playersDemo;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.playersDemo.domain.Player;
import com.playersDemo.repo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
class PlayersBootStrapCommandLineRunner implements CommandLineRunner {
    private static final String CSV_FILE_PATH = "People.csv";

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public void run(String... args) throws Exception {
        try (
                Reader reader =
                        Files.newBufferedReader(Path.of(
                                ClassLoader.getSystemResource(CSV_FILE_PATH).toURI()));
        ) {
            CsvToBean<Player> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Player.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<Player> players = csvToBean.parse();
            playerRepository.saveAll(players);
        }
    }
}