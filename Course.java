
public class Course {
    private Obstacles[] poolCourse = {new Obstacles("Shao Kahn"),
            new Obstacles("Motaro"), new Obstacles("Goro")};

    public void doIt(Team team){
        for (Runner courRunner:team.runners){
            int result = 0;
            for (Obstacles courObst:poolCourse){
                result += courObst.overcome(courRunner.getRunnerName());
            }
            courRunner.setTime(result);
        }
    }
}
