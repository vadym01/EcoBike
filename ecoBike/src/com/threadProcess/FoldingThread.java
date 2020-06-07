package com.threadProcess;

import com.DAO.FoldingData;

public class FoldingThread implements Runnable {
    FoldingData foldingData = new FoldingData();

    @Override
    public synchronized void run() {
        foldingData.getAll();
    }
}
