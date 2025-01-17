# chatbot.evan.Evan project template

This is a project template for a greenfield Java project. It's named after my english name "Evan". Given below are instructions on how to use it.

## Setting up in Intellij

Prerequisites: JDK 11, update Intellij to the most recent version.

1. Open Intellij (if you are not in the welcome screen, click `File` > `Close Project` to close the existing project first)
1. Open the project into Intellij as follows:
   1. Click `Open`.
   1. Select the project directory, and click `OK`.
   1. If there are any further prompts, accept the defaults.
1. Configure the project to use **JDK 11** (not other versions) as explained in [here](https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk).<br>
   In the same dialog, set the **Project language level** field to the `SDK default` option.
3. After that, locate the `src/main/java/chatbot.evan.Evan.java` file, right-click it, and choose `Run chatbot.evan.Evan.main()` (if the code editor is showing compile errors, try restarting the IDE). If the setup is correct, you should see something like the below as the output:
   ```
   Hello! I'm Evan, your personal task planning assistant.
   What can I do for you?
   
   Available commands:
   todo: create a new todo task
   deadline: create a new deadline task
   event: create a new event task
   mark: mark a task as complete
   unmark: mark a task as incomplete
   delete: delete a task from the list
   find: find a task from the list
   list: show a list of all the tasks saved
   ```
   For more information on how to use the commands, do check out our README documentation in the docs folder!
