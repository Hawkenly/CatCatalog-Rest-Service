package org.example.carcatalog;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@AllArgsConstructor
@SpringBootTest
class CarCatalogApplicationTests {

    private ApplicationContext context;

    @Test
    void contextLoads() {
        assertNotNull(context);

    }

}
