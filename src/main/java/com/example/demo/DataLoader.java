package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    MessageRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Message message = new Message("Howdy","Lorem ipsum dolor sit amet, consectetur adipisicing elit. " +
                "Accusamus, accusantium adipisci consequuntur et illum inventore iure maiores.","06/12/2018","Ernest Shackleton");
        repository.save(message);

        message = new Message("Sooo booorrrred","necessitatibus quae aliquid asperiores aut autem explicabo fugit impedit inventore, ipsum nisi omnis. " +
                "Aliquid asperiores aut autem explicabo fugit impedit inventore, ipsum nisi omnis.","01/12/2019","Boaty McBoatface");
        repository.save(message);

        message = new Message("OMG!!!","Lorem ipsum dolor sit amet, consectetur adipisicing elit. " +
                "Accusamus, accusantium adipisci consequuntur et illum inventore","02/12/2019","Inspired Fool");
        repository.save(message);
    }


}
