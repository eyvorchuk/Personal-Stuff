#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <readline/readline.h>
#include <readline/history.h>

int main() {
  char* command = "bg ls -l";
  char* newCommand = malloc(sizeof(char) * strlen(command));
  strcpy(newCommand, command);
  newCommand += 3;
  printf("%s\n", newCommand);
}
