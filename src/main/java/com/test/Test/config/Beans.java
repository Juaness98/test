package com.test.Test.config;

import com.test.Test.usecase.DataUseCase;
import com.test.Test.usecase.ProcessDataUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public DataUseCase dataUseCase(){
        return new DataUseCase();
    }

    @Bean
    public ProcessDataUseCase processDataUseCase(DataUseCase dataUseCase){
        return new ProcessDataUseCase(dataUseCase);
    }
}
