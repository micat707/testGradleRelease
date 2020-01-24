package org.junit.runner;

import com.test.agentmain.StartupTest;

public abstract class Runner1 implements Describable {
    static {
        StartupTest.initializeIfPossible();
    }
}
