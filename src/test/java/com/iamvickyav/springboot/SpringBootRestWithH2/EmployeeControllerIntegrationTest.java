package com.iamvickyav.springboot.SpringBootRestWithH2;

import com.bitozen.springboot.SpringBootRestWithH2.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class EmployeeControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testEmployee()
    {
        assertTrue(
                this.restTemplate
                        .getForObject("http://localhost:" + port + "/employee/1", Employee.class)
                        .getId().equals(1));
    }

    @Test
    public void testAllEmployee() {
        assertTrue(
                this.restTemplate
                        .getForObject("http://localhost:" + port + "/employees", List.class).size() == 2);
    }
}

