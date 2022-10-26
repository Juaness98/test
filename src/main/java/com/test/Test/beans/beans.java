package com.test.Test.beans;

import com.test.Test.usecase.ProcessDataUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class beans {

    @Bean
    public ProcessDataUseCase processDataUseCase(){
        return new ProcessDataUseCase();
    }
}
