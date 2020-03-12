#include <unistd.h>
#include <string.h>
#include <stdlib.h>
#include <stdio.h>

struct bg_pro{
 int pid;
 char command[1024];
 struct bg_pro* next;
};

struct bg_pro* createNode(struct bg_pro* root) {
  root = malloc(sizeof(struct bg_pro));
  root->pid = 123;
  strcpy(root->command, "Hello world");
  root->next = NULL;
  printf("%s\n", root->command);
  return root;
}

void addNode(struct bg_pro* root) {
  struct bg_pro* curr = root;
  while(curr->next != NULL) {
    curr = curr->next;
  }
  curr->next->pid
}
int main() {
  struct bg_pro* root = NULL;
  root = createNode(root);
  addNode(root);
  if(root == NULL) {
    printf("root is null\n");
  } else {
  printf("%s\n", root->command); }
}
