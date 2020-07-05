package com.sher;

import com.sher.convertor.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new AddressDtoToAddressConverter());
        registry.addConverter(new AddressToAddressDtoConverter());

        registry.addConverter(new GymDtoToGymConverter());

        registry.addConverter(new PersonDtoToPersonConverter());
        registry.addConverter(new PersonToPersonDtoConverter());

        registry.addConverter(new MembershipDtoToMembership());

        registry.addConverter(new VisitDtoToVisitConverter());
        registry.addConverter(new VisitToVisitDtoConverter());

        registry.addConverter(new TrainingDtoToTrainingConverter());
    }
}
