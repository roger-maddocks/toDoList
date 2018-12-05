package com.github.maddocks.roger.todolist.logFunctionality;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {


    Logger logging = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/v1/tasks")
    public String indexLog() {
        logging.trace("TRACE message");
        logging.error("ERROR message");
        logging.debug("DEBUG message");
        logging.info("INFO message");
        logging.warn("WARNING message");

        return "Check the logs for detailed information";
    }
}
