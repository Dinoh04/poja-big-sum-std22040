package com.poja.bigSum.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.poja.bigSum.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
