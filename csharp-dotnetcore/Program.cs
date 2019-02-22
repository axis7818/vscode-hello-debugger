using System;
using CommandLine;

namespace csharp_dotnetcore
{
   class Program
   {
      static void Main(string[] args)
      {
         Parser.Default.ParseArguments<Options>(args).WithParsed<Options>(o =>
         {
            string name = o.Name;
            Console.WriteLine($"Hello, {name}!");
         });
      }
   }
}
