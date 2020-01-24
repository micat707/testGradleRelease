package org.junit.runner;

import com.test.agentmain.StartupTest;
import org.junit.runner.notification.RunNotifier;
public abstract class Runner implements Describable {
    static {
        StartupTest.initializeIfPossible();
    }

    /* (non-Javadoc)
     * @see org.junit.runner.Describable#getDescription()
     */
    public abstract Description getDescription();

    /**
     * Run the tests for this runner.
     * @param notifier will be notified of events while tests are being run--tests being
     * started, finishing, and failing
     */
    public abstract void run(RunNotifier notifier);

    /**
     * @return the number of tests to be run by the receiver
     */
    public int testCount() {
        return getDescription().testCount();
    }
}
