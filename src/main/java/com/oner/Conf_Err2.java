package com.oner;

import java.util.List;
import java.util.Map;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("err-2")
@Configuration
@ConfigurationProperties(prefix  = "test")
@Data
public class Conf_Err2 {

	private Map<String, Object[]> mapdata;
	private List<String> listdata;

}
