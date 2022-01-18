/*
* Java Core
* version 18.01.2022
* author Mokrous Alex*/

public class Team {
    private String teamName;

    public Runner[] runners = {new Runner("John"), new Runner("Kevin"),
            new Runner("Alexey"), new Runner("Dima")};

    public Team(String teamName) {
        this.teamName = teamName;

    }

    public void membersName() {
        System.out.println("Команда " + this.teamName + " Члены команды:");
        for (int i = 0; i < runners.length; i++)
            System.out.println(runners[i]);

    }

    public void showResults() {
        for (Runner courRunner : runners) {
            System.out.println(courRunner.getRunnerName() + ": " + courRunner.getTime());
        }
    }
}