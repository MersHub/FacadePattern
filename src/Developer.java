public class Developer {

    public void doJob(BugTracker bugTracker) {
        if(bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problem ...");
        }else {
            System.out.println("Developer is reading Habr....");
        }
    }
}
