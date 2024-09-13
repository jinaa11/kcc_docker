package com.kcc.spring_docker;

import com.kcc.spring_docker.mapper.MemberMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDockerApplicationTests {

    @Autowired
    private MemberMapper mapper;
    @Test
    void contextLoads() {
        Assertions.assertNotNull(mapper.selectAllMembers());
    }

}
