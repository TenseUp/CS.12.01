public class StepTracker {

    private int steps = 0;
    private int days = 0;

    private int activeDays = 0;

    private int stepReq = 0;
    public StepTracker(int s){
        this.stepReq = s;
    }

    void addDailySteps(int s){
        this.steps += s;
        if(s >= stepReq) this.activeDays++;
        this.days++;
    }

    public int getTotalSteps() {
        return steps;
    }

    public int getStepsForActiveDay() {
        return stepReq;
    }

    public int getDays() {
        return days;
    }


    int getActiveDays(){
        return this.activeDays;
    }
    int activeDays(){
        return this.activeDays;
    }

    double averageSteps(){
        double avg = 0.0;
        try{
            avg = this.steps/this.days;
        } catch(Exception e){}
        return avg;
    }
}
