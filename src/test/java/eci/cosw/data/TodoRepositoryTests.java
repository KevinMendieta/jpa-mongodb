package eci.cosw.data;

import eci.cosw.data.model.Todo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoRepositoryTests {

    @Autowired
    private TodoRepository repository;

    @Before
    public void init() {
        repository.deleteAll();
        repository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
        repository.save(new Todo("do something", "5", "2018-01-01", "test@mail.com", "pending"));
    }

    @Test
    public void findByResponsibleTest() {
        List<Todo> result = repository.findByResponsible("email@test.com");
        assertEquals(0, result.size());
        result = repository.findByResponsible("test@mail.com");
        assertEquals(2, result.size());
    }

}
