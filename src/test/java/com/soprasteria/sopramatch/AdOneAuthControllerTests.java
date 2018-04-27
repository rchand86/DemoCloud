package com.soprasteria.sopramatch;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SopraMatchBackendApplication.class)
@AutoConfigureMockMvc
public class AdOneAuthControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void noParamAuthUserResponseShouldOk() throws Exception {
        this.mockMvc.perform(get("/api/authUser")).andDo(print()).andExpect(status().isOk());
    }

}
