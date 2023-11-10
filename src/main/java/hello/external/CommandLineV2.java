package hello.external;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

import java.util.List;
import java.util.Set;

@Slf4j
public class CommandLineV2 {

    public static void main(String[] args) {
        for(String arg : args){
            log.info("args {}",arg);
        }

        ApplicationArguments arrArgs = new DefaultApplicationArguments(args);
        log.info("SourceArgs = {}", List.of(arrArgs.getSourceArgs()));
        log.info("NonOptionsArgs = {}",arrArgs.getNonOptionArgs());
        log.info("OptionsNames = {}", arrArgs.getOptionNames());

        Set<String> optionNames = arrArgs.getOptionNames();
        for(String optionName : optionNames){
            log.info("option arg {}={}", optionName, arrArgs.getOptionValues(optionName));
        }
    }
}
