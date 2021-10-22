package com.fludilka.fludilka;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
        List<User> findByNick(String nick);
        User findById(long id);
}
