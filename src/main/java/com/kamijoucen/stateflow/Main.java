package com.kamijoucen.stateflow;

import com.kamijoucen.ruler.Ruler;

public class Main {

    public static void main(String[] args) {
        System.out.print("hello");
        Ruler.compileExpression("println(' world!')").run();
    }

}
