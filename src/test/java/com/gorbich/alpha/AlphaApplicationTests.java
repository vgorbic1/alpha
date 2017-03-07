package com.gorbich.alpha;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import com.gorbich.alpha.web.i18n.I18nService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlphaApplicationTests {
	
    @Autowired
    private I18nService I18nService;

    @Test
    public void testMessageByLocaleService() throws Exception {
        String expectedResult = "My First Bootstrap Page";
        String messageId = "index.jumbotron.h1";
        String actual = I18nService.getMessage(messageId);
        assertThat(actual).isEqualTo(expectedResult);
    }

}
