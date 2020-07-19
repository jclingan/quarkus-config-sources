package org.acme;

import javax.inject.Inject;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.spi.ConfigSource;

import io.quarkus.runtime.QuarkusApplication;

public class ConfigSourceMain implements QuarkusApplication {
  @Inject
  Config config;

  @Override
  public int run(String... args) throws Exception {   
    for (ConfigSource source : config.getConfigSources()) {
      System.out.println("" + source.getName() + " " + source.getOrdinal());
  }
    return 0;
 }
}