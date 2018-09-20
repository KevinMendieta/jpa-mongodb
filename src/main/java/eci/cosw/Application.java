package eci.cosw;

import eci.cosw.data.TodoRepository;
import eci.cosw.data.model.Todo;
import eci.cosw.data.model.User;
import eci.cosw.data.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Date;
import java.util.List;

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
        // todos
        todoRepository.deleteAll();
        todoRepository.save(new Todo("do something", 5, new Date(2018, 2,1), "kevin@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 4 , new Date(2018, 11,1), "kevin@mail.com", "pending"));
        todoRepository.save(new Todo("do something awesome lol", 1, new Date(2018, 10,1), "kevin@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 4, new Date(2018, 1,1), "kevin@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 5, new Date(2018, 2,1), "carla@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 4, new Date(2018, 2,1), "carla@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 6, new Date(2018, 1,1), "carla@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 3, new Date(2018, 11,1), "jaime@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 5, new Date(2018, 1,1), "angie@mail.com", "pending"));
        todoRepository.save(new Todo("do something awesome lol", 3, new Date(2018, 1,1), "angie@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 6, new Date(2018, 2,1), "angie@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 5, new Date(2018, 11,1), "angie@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 5, new Date(2018, 1,1), "yeison@mail.com", "pending"));
        todoRepository.save(new Todo(" awesome lol", 6, new Date(2018, 11,1), "yeison@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 5, new Date(2018, 5,1), "paulina@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 3, new Date(2018, 1,1), "martin@mail.com", "pending"));
        todoRepository.save(new Todo("do  awesome lol", 5, new Date(2018, 1,1), "martin@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 5, new Date(2018, 5,1), "martin@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 2, new Date(2018, 4,1), "martin@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 5, new Date(2018, 5,1), "martin@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 3, new Date(2018, 2,1), "martin@mail.com", "pending"));
        todoRepository.save(new Todo("do something  awesome lol", 5, new Date(2018, 2,1), "diana@mail.com", "pending"));
        todoRepository.save(new Todo("do something", 5, new Date(2018, 11,1), "miguel@mail.com", "pending"));
        todoRepository.save(new Todo(" awesome lol", 3, new Date(2018, 11,1), "camila@mail.com", "pending"));
        //users
        userRepository.deleteAll();
        userRepository.save(new User("kekox","kevin@mail.com"));
        userRepository.save(new User("carla","carla@mail.com"));
        userRepository.save(new User("jaime","jaime@mail.com"));
        userRepository.save(new User("angie","angie@mail.com"));
        userRepository.save(new User("yeison","yeison@mail.com"));
        userRepository.save(new User("paulina","paulina@mail.com"));
        userRepository.save(new User("martin","martin@mail.com"));
        userRepository.save(new User("diana","diana@mail.com"));
        userRepository.save(new User("miguel","miguel@mail.com"));
        userRepository.save(new User("camila","camila@mail.com"));

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");
        //queries
        Query query = new Query();
        query.addCriteria(Criteria.where("dueDate").lt(new Date(System.currentTimeMillis())));
        List<Todo> todos = mongoOperation.find(query, Todo.class);

        Query secondQuery = new Query();
        secondQuery.addCriteria(Criteria.where("priority").gt(4));
        List<Todo> todos2 = mongoOperation.find(secondQuery, Todo.class);
    }

}