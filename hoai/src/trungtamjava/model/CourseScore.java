package trungtamjava.model;

import java.util.Scanner;

public class CourseScore {
    int id;
    int score;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseScore(int id, int score, String name) {
        this.id = id;
        this.score = score;
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id:");
        int id = scanner.nextInt();
        System.out.println("ID:" + id);
        System.out.println("nhap Score:");
        int score = scanner.nextInt();
        System.out.println("Score:" + score);
        System.out.println("nhap name:");
        String name = scanner.next();
        System.out.println("name:"+name);
scanner.close();

        if (score < 5) {
            System.out.println("HS yeu");
        }
        if (score >= 5 && score<7)
        {
            System.out.println("HS TB");
        }
        if (score >= 7 && score < 8) {
            System.out.println("HS Kha");
        }
        if (score >= 8 && score < 9) {
            System.out.println("HS Gioi");
        }
        if (score>=9){
            System.out.println("Hs xuat sac");

        }
    }
}
