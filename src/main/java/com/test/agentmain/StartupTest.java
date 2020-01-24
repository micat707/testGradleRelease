package com.test.agentmain;

import java.io.IOException;
import java.lang.instrument.Instrumentation;

public final class StartupTest {
    private static Instrumentation instrumentation;
    public static final float JAVA_VERSION= 1.8f;

    public static void agentmain(@SuppressWarnings("unused") String agentArgs, Instrumentation inst)
            throws IOException {
        System.out.println("I am herer");
    }
    public static void premain(String agentArgs, Instrumentation inst) throws IOException
    {
        System.out.println("I am herer");
    }

    public static boolean initializeIfPossible()
    {
        System.out.println("I am herer agent");

        return true;
    }
    private static Instrumentation getInstrumentation()
    {


        return instrumentation;
    }



}
