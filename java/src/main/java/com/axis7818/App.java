package com.axis7818;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Hello world!
 *
 */
public class App {

   public static void main(String[] args) {

      Options options = new Options();
      options.addOption("n", "name", true, "Who to say hi to");
      CommandLineParser parser = new DefaultParser();
      CommandLine cmd = null;
      try {
         cmd = parser.parse(options, args);
      } catch (ParseException e) {
         new HelpFormatter().printHelp("hello", options);
         System.err.println("Failed to parse command line options");
         e.printStackTrace();
         System.exit(1);
      }

      String name = cmd.getOptionValue("name");
      if (name == null) {
         new HelpFormatter().printHelp("hello", options);
      } else {
         System.out.println(String.format("Hello, %s!", name));
      }

   }

}
