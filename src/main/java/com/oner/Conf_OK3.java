package com.oner;

import java.util.List;
import java.util.Map;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("conf-ok3")
@Configuration
@ConfigurationProperties(prefix  = "test")
@Data
public class Conf_OK3 {

	private Map<String, List<String>> mapdata;
	private Object[] listdata;

}
