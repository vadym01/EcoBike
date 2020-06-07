package com.threadProcess;

import com.DAO.SpeedelecData;
import com.ecoBike.Speedelec;

public class SpeedelecThread implements Runnable {
    SpeedelecData speedelecData = new SpeedelecData();

    @Override
    public synchronized void run() {
        speedelecData.getAll();
    }
}
