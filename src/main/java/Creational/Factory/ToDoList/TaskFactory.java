package Creational.Factory.ToDoList;

public enum TaskFactory {

    BUG_FIX{
      @Override
        public Task createTask(){
          return new BugFix();
      }
    },
    FEATURE_DEVELOPMENT{
        @Override
        public Task createTask(){
            return new FeatureDevelopment();
        }
    },
    MAINTENANCE{
        @Override
        public Task createTask(){
            return new Maintenance();
        }
    },
    REFACTORING {
        @Override
        public Task createTask(){
            return new Refactoring();
        }
    },
    TESTING{
        @Override
        public Task createTask(){
            return new Testing();
        }
    },
    DEPLOYMENT{
        @Override
        public Task createTask(){
            return new Deployment();
        }

    };

    public abstract  Task createTask();
}
