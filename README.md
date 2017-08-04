# rest-emulator
rest service emulator

This project will allow you mock json-data to a specific url.

You can build the project with maven. After it you will find 'target' folder in the project root.
There you can find 'rest-emulator' directory, it will contain:
  <br>-resources directory(icnludes mapping and json-files)
  <br>-rest-emulator.jar(project it self)
  <br>-start.bat file(use to start emulator)

<br>How to add new url-json mapping:
<br>-compile project
<br>-go to target/rest-emulator/resources/url-json.properties
<br>-add new mapping(for example: /api/test=test.json)
<br>-add json-file to the resources folder(file with name that was used for mapping in prev step)
<br>-start the emulator with start.bat

