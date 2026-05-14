#include<stdio.h>

struct tasks{
	int id;
	char descp[100];
	char status[50];
};
struct tasks t[100];
int count =0;

void Addtasks(){
printf("enter task id");
scanf("%d",&t[count].id);
printf("enter description");
scanf("%s",t[count].descp);
printf("enter status-incomplete/completed");
scanf("%s",t[count].status);

count ++;
printf("added");
}

void Updatetasks() {
    int id;
    printf("Enter task id to update: ");
    scanf("%d", &id);

    for (int i = 0; i < count; i++) {
        if (t[i].id == id) {
            printf("Enter new status: ");
            scanf("%s", t[i].status);   // FIXED
            printf("Task updated successfully!\n");
            return;
        }
    }

    printf("Task not found!\n");
}

	void Displaytasks(){
		for(int i=0;i<count;i++){
			printf("\nid:%d\n",t[i].id);
			printf("\ndescp:%s\n",t[i].descp);
			printf("\nstatus:%s\n",t[i].status);
		}
	}
	
	
	int main(){
	int choice;
	
	do{
		printf("1.Add task");
		printf("2.Update task");
		printf("3.Display task");
		printf("4.exit");
		
		printf("\n enter your choice:");
		scanf("%d",&choice);
		
	if (choice == 1)
            Addtasks();
        else if (choice == 2)
            Updatetasks();
        else if (choice == 3)
            Displaytasks();
	}while(choice != 4);
	return 0;

}
