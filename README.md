# vscode-hello-debugger

Practicing vscode debugging with various languages.

Each top-level folder includes a simple hello world program that is intended to be debugged.

Debug configurations for these projects are defined inside `.vscode/launch.json`

![vscode debugging](debugging.png)

## Language/Project Examples

* TypeScript
  * [Node](./ts-node/README.md)
  * [Client Side](./ts-react/README.md) (shown with a simple `create-react-app` project)
* [Python](./python/README.md)
* [Java](./java/README.md)

Each project has a debugging configuration specified in `.vscode/launch.json` that can be run
from the debugger panel. Simply set a breakpoint inside a project and run the debug configuration.

Some languages may require installing additional vscode extensions.
