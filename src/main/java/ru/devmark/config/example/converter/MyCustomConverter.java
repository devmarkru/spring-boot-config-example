package ru.devmark.config.example.converter;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@ConfigurationPropertiesBinding
public class MyCustomConverter implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String timestamp) {
        return LocalDate.parse(timestamp);
    }
}
