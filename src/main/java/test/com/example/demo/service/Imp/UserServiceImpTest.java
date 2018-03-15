package test.com.example.demo.service.Imp; 

import com.example.demo.pojo.User;
import com.example.demo.service.Imp.UserServiceImp;
import com.example.demo.service.UserSerevice;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/** 
* UserServiceImp Tester. 
* 
* @author <Authors name> 
* @since <pre>03/15/2018</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest()
public class UserServiceImpTest {

//    @Autowired
//    @Qualifier("userServiceImp")
    @Resource(name = "userServiceImp")
    private UserSerevice userService;

    private String userName="admin";

@Before
public void before() throws Exception {

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: findUserByName(String name) 
* 
*/ 
@Test
public void testFindUserByName() throws Exception { 
//TODO: Test goes here...
   User user= userService.findUserByName(userName);
    System.out.println(user.toString());
} 

/** 
* 
* Method: showUsers(String uid) 
* 
*/ 
@Test
public void testShowUsers() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findUserIdByName(String userName) 
* 
*/ 
@Test
public void testFindUserIdByName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findRoleIdByUid(int uid) 
* 
*/ 
@Test
public void testFindRoleIdByUid() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findPermissionIdByRoleId(int roleId) 
* 
*/ 
@Test
public void testFindPermissionIdByRoleId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findRoleByRoleId(int roleId) 
* 
*/ 
@Test
public void testFindRoleByRoleId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findPermissionById(int id) 
* 
*/ 
@Test
public void testFindPermissionById() throws Exception { 
//TODO: Test goes here... 
} 


} 
