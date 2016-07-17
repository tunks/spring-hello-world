/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.att.service;

import com.att.SpringHelloWorldApplication;
import com.att.model.User;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author ebrimatunkara
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@SpringApplicationConfiguration(SpringHelloWorldApplication.class)
@WebAppConfiguration 
public class UserServiceTest {
   
    @Autowired
    UserService userService;
    
    public UserServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        User user = new User("1001","User1");
        userService.addUser(user);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of allUsers method, of class UserService.
     */
    @Test
    public void testAllUsers() {
        System.out.println("allUsers");
        List<User> result = userService.allUsers();
        if(result != null){
         assertTrue(result.size() >0);
        }
    }

    /**
     * Test of addUser method, of class UserService.
     */
    @Test
    public void testAddUser() {
        User user = new User("3001","Use30111");
        User result = userService.addUser(user);
        assertEquals(user, result);
    }

    /**
     * Test of deleteUser method, of class UserService.
     */
    @Test
    public void testDeleteUser() {
        String id = "1001";
        userService.deleteUser(id);
        User user = userService.findUser(id);
        assertNull(user);
    }
    
    
      /**
     * Test of FindUser method, of class UserService.
     */
    @Test
    public void testFindUser() {
        String id = "10002";
        User user = new User(id,"User2");
        userService.addUser(user);
        User expectedUser = userService.findUser(id);
        assertNotNull(expectedUser);
        assertEquals(user,expectedUser);
    }
    
}
