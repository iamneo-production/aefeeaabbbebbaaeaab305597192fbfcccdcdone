package com.example.springapp;

// import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
// import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
class SpringappApplicationTests {

	@Autowired
	private  MockMvc mockMvc ;

	

	@Test
	void testgetByID() throws Exception{	

		 mockMvc.perform(get("/employee/1000")
		 				.accept(MediaType.APPLICATION_JSON))
						.andDo(print())
						.andExpect(status().isOk());
					
	}

	

    @Test
    public void testApiControllerClassExists() {
        checkClassExists("com.example.springapp.controller.ApiController");
    }

    @Test
    public void testEmpRepoClassExists() {
        checkClassExists("com.example.springapp.repository.EmployeeRepo");
    }

    @Test
    public void testApiServiceClassExists() {
        checkClassExists("com.example.springapp.service.ApiService");
    }

    @Test
    public void testEmployeeModelClassExists() {
        checkClassExists("com.example.springapp.model.Employee");
    }

     private void checkClassExists(String className) {
        try {
            Class.forName(className);
        } catch (ClassNotFoundException e) {
            fail("Class " + className + " does not exist.");
        }
    }

   
}
