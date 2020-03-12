#include <unistd.h>
#include <string.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
  char** args = malloc(sizeof(char*) * 3);
  args[0] = "ls";
  args[1] = "-l";
  args[2] = "&";
  /*command += 3;
  strcat(command, " &");
  args[0] = strtok(command, " \n");
  int argc = 0;
  while(args[argc] != NULL) {
    args[argc + 1] = strtok(NULL, " \n");
    argc++;
  }*/
  pid_t p = fork();
  if (p == 0) {
    execvp(args[0], args);
  } else {
    wait(NULL);
  }
}
