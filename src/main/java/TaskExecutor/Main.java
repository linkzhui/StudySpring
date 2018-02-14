package TaskExecutor;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService aysncTaskService = context.getBean(AsyncTaskService.class);
        for(int i = 0;i<10;i++)
        {
            aysncTaskService.executeAsyncTask(i);
            aysncTaskService.executeAsyncTaskPlus(i);
        }

        context.close();

    }
}
