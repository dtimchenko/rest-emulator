# rest-emulator
rest service emulator

This project will allow you mock json-data to a specific url.

You can build the project with maven. After it you will find 'target' folder in the project root.
There you can find 'rest-emulator' directory, it will contain:
  -resources directory(icnludes mapping and json-files)
  -rest-emulator.jar(project it self)
  -start.bat file(use to start emulator)

Resources directory include:
  -url-json.properties(mapping for url and json file)
  -test.json(test json file to check if emulator working)
To add new mapping you just need go to url-json.properties add new mapping <custom_url>=<costom_file.json> and costom_file.json to resources folder. And start/restart emulator.

