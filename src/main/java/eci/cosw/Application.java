package eci.cosw;

import eci.cosw.data.TodoRepository;
import eci.cosw.data.model.Todo;
import eci.cosw.data.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

@SpringBootApplication
public class Application implements CommandLineRunner {


    @Autowired
    private TodoRepository todoRepository;
    @Autowired
    private UserRepository userRepository;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.deleteAll();
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        todoRepository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));



        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");


    }

}