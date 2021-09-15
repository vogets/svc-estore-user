package com.estore.svcestoreuser;



import com.estore.svcestoreuser.entities.Role;
import com.estore.svcestoreuser.entities.User;
import com.estore.svcestoreuser.repositories.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.util.HashSet;
import java.util.Set;

@DataJpaTest
@Rollback(value = true)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser()
    {
        Role roleAdmin=entityManager.find(Role.class,1);
        Set<Role> roles=new HashSet<>();
        roles.add(roleAdmin);
        User sampleUser=new User("sameervogeti@gmail.com","sameer","vogeti","Kites#123");
        sampleUser.setRoles(roles);
        User savedUser=userRepository.save(sampleUser);
        Assert.assertEquals(savedUser.getEmail(),"sameervogeti@gmail.com");
    }
}
