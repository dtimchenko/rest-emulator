# rest-emulator
rest service emulator

This project will allow you mock json-data to a specific url.

You can build the project with maven. After it you will find 'target' folder in the project root.
There you can find 'rest-emulator' directory, it will contain:
  -resources directory(icnludes mapping and json-files)
  -rest-emulator.jar(project it self)
  -start.bat file(use to start emulator)

How to add new url-json mapping:
-compile project
-go to target/rest-emulator/resources/url-json.properties
-add new mapping(for example: /api/test=test.json)
-add json-file to the resources folder(file with name that was used for mapping in prev step)
-start the emulator with start.bat

