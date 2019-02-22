using CommandLine;

namespace csharp_dotnetcore
{
   class Options
   {
      [Option('n', "name", Required = true, HelpText = "Who to say hi to")]
      public string Name { get; set; }
   }
}
