package com.liukaining.design_pattern.visitor;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries !!!");
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");

            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);

            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));
            rootDir.accept(new ListVisitor());

            System.out.println("");

            System.out.println("Making root usr !!!");
            Directory yukiDirectory = new Directory("yuki");
            Directory hanakoDirectory = new Directory("hanako");
            Directory tomuraDirectory = new Directory("tomura");
            usrDir.add(yukiDirectory);
            usrDir.add(hanakoDirectory);
            usrDir.add(tomuraDirectory);

            yukiDirectory.add(new File("diary.html", 100));
            yukiDirectory.add(new File("Composite.java", 200));
            hanakoDirectory.add(new File("memo.tex", 300));
            tomuraDirectory.add(new File("game.doc", 400));
            tomuraDirectory.add(new File("junk.mail", 500));

            rootDir.accept(new ListVisitor());


        } catch (FileTreatementException e) {
            e.printStackTrace();
        }
    }
}
