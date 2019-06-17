package Adapter;

public class School {

    public static void main(String[] args) {

        Pen pen = new PenAdapter();

        AssignmentWork a = new AssignmentWork();
        a.setPen(pen);
        a.writeAssignment("Assignment 1 - requirements");

    }
}
